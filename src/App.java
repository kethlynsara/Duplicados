public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String []{"Ross", "Rachel", "Chandler", "Monica", "Joey", "Pheobe"};
        String[] array2 = new String []{"Janice", "Ross", "Carol", "Rachel", ""};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    j = array2.length;

                }
            }
        }
    }
}
