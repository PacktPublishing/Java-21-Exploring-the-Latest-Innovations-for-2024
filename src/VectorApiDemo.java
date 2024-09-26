import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorApiDemo {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = { 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] result = new int[array1.length];

        // Define the species of vector we are working with. This example uses integer
        // vectors.
        // The preferred species depends on the CPU architecture and can process a
        // certain number of elements in parallel.
        VectorSpecies<Integer> species = IntVector.SPECIES_PREFERRED;

        // Loop over the arrays in chunks that match the vector species length.
        for (int i = 0; i < array1.length; i += species.length()) {
            // Load parts of the input arrays into vectors.
            IntVector vector1 = IntVector.fromArray(species, array1, i);
            IntVector vector2 = IntVector.fromArray(species, array2, i);

            // Perform the vector operation. In this case, vector addition.
            IntVector resultVector = vector1.add(vector2);

            // Store the result of the operation back into the result array.
            resultVector.intoArray(result, i);
        }

        // Output the result.
        for (int i = 0; i < result.length; i++) {
            System.out.println("Result[" + i + "] = " + result[i]);
        }
    }
}
