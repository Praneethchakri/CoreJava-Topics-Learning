package reflection.programs;

import java.lang.reflect.Field;

import reflection.programs.data.model.Address;
import reflection.programs.data.model.Company;
import reflection.programs.data.model.Person;

public class Reflection_FieldsClass {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Address address = new Address("Bangalore", "AyyapaNagar");
		Company company = new Company("SelfGrowth", (short) 2);
		Person p = new Person("Praneeth", "Karnataka", 33, true, 10.20234f, address, company);
		String json = ObjectToJson(p, 0);
		System.out.println(json);

	}

	private static String indentation(int sizeIndentation) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sizeIndentation; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}

	private static String ObjectToJson(Object instance, int indentSize)
			throws IllegalArgumentException, IllegalAccessException {

		Field[] fields = instance.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		sb.append(indentation(indentSize));
		sb.append("{");
		sb.append("\n");
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			field.setAccessible(true); // which will allow to access the restricted modifier fields as well

			if (field.isSynthetic()) {
				continue;
			}
			sb.append(indentation(indentSize + 1));
			sb.append(formatStringValue(field.getName()));
			sb.append(":");

			if (field.getType().isPrimitive()) {
				sb.append(formatPrimitiveValues(field, instance));
			} else if (field.getType().equals(String.class)) {
				sb.append(formatStringValue(field.get(instance).toString()));
			} else {
				sb.append(ObjectToJson(field.get(instance), indentSize+1));
			}

			if (i != fields.length - 1) {
				System.out.println(String.format(" i : %s ,Field Array Length :  %s , Condition Check  : %s ", i,
						fields.length, i != fields.length - 1));
				sb.append(",");
			}
			sb.append("\n");
		}
		sb.append(indentation(indentSize));
		sb.append("}");

		return sb.toString();
	}

	private static String formatPrimitiveValues(Field field, Object instanceObject)
			throws IllegalArgumentException, IllegalAccessException {

		if (field.getType().equals(boolean.class) || field.getType().equals(int.class)
				|| field.getType().equals(short.class)) {
			return field.get(instanceObject).toString();
		} else if (field.getType().equals(double.class) || field.getType().equals(float.class)) {
			return String.format("%.02f", field.get(instanceObject));
		}
		throw new RuntimeException(String.format("Type %s is unDefined", field.getType().getName()));
	}

	private static String formatStringValue(String value) {
		return String.format("\"%s\"", value);

	}

}
