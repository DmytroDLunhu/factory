package factory;

public class JavaScriptDevFactory implements DevFactory {
    @Override
    public Dev createDeveloper() {
        return new JavaScriptDev();
    }
}
