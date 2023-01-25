package factory;

public class Main {
    public static void main(String[] args) {
        DevFactory devFactory = createDevByLanguage("Java");
//      or
//      DevFactory devFactory = createDevByLanguage("C++");
//      or
//      DevFactory devFactory = createDevByLanguage("JavaScript");

        Dev developer = devFactory.createDeveloper();
        developer.writeCode();
    }

    static DevFactory createDevByLanguage(String language) {
        if (language.equalsIgnoreCase("Java")) {
            return new JavaDevFactory();
        } else if (language.equalsIgnoreCase("C++")) {
            return new CppDevrFactory();
        } else if (language.equalsIgnoreCase("JavaScript")) {
            return new JavaScriptDevFactory();
        } else {
            throw new RuntimeException(language + "is unknown language.");
        }
    }
}