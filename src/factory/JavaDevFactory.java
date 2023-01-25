package factory;

public class JavaDevFactory implements DevFactory {
    @Override
    public Dev createDeveloper() {
        return new JavaDev();
    }

}
