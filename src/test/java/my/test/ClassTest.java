package my.test;

public class ClassTest {
    public static void main(String[] args) {
         //1
         Class<Model> modelClass = Model.class;
         //2
         Model model = new Model();
         Class<? extends Model> aClass = model.getClass();
         //3
        try {
            Class<?> aClass1 = Class.forName("my.test.Model");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        final String string = model.toString();
        System.out.println(string);
    }
}
