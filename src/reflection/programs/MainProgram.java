/*
 * package reflection.programs;
 * 
 * public class MainProgram {
 * 
 * private static void printClassInfo(Class<?>... classes) { for (Class<?> clazz
 * : classes) {
 * System.out.println(String.format("Class Name: %s, Class package Name : %s",
 * clazz.getSimpleName(), clazz.getPackageName()));
 * 
 * Class<?>[] implementedInterface = clazz.getInterfaces();
 * 
 * for (Class<?> implementedInterfaces : implementedInterface) {
 * System.out.println(String.format("Class : %s impelemts : %s",
 * implementedInterface)); }
 * 
 * System.out.println(); System.out.println(); }
 * 
 * }
 * 
 * private static class Squre implements Drawable {
 * 
 * @Override public int getNumberOfCorners() { return 4; }
 * 
 * }
 * 
 * private static interface Drawable { int getNumberOfCorners(); }
 * 
 * private enum colour { BLUE, RED, YELLOW }
 * 
 * }
 */