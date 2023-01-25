package factory;

public class CppDevrFactory implements DevFactory {
    @Override
    public Dev createDeveloper() {
        return new CppDev();
    }
}
