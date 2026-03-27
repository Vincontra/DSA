import java.io.*;
import java.util.*;

public class Assembly{

    static int LC = 0;  // Location Counter

    // Symbol Table
    static HashMap<String, Integer> symbolTable = new HashMap<>();

    // Literal Table
    static ArrayList<String> literalTable = new ArrayList<>();
    static ArrayList<Integer> literalAddress = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("vinay.txt"));

        String line;
        System.out.println("----- PASS 1 OUTPUT -----");
        System.out.println("LC\tInstruction\tIntermediate Code");

        while ((line = br.readLine()) != null) {

            line = line.trim();
            String[] tokens = line.split(" ");

            if (tokens[0].equals("START")) {
                LC = Integer.parseInt(tokens[1]);
                System.out.println(LC + "\t" + line + "\t(AD,01) (C," + LC + ")");
            }

            else if (tokens.length == 3 && tokens[1].equals("DC")) {
                symbolTable.put(tokens[0], LC);
                System.out.println(LC + "\t" + line + "\t(DL,02) (C," + tokens[2] + ")");
                LC++;
            }

            else if (tokens[0].equals("LOAD")) {
                String symbol = tokens[1];
                if (!symbolTable.containsKey(symbol)) {
                    symbolTable.put(symbol, -1); // forward reference
                }
                System.out.println(LC + "\t" + line + "\t(IS,11) (S,?)");
                LC++;
            }

            else if (tokens[0].equals("ADD")) {
                String literal = tokens[1];
                literalTable.add(literal);
                literalAddress.add(-1); // address assigned later
                System.out.println(LC + "\t" + line + "\t(IS,01) (L,?)");
                LC++;
            }

            else if (tokens[0].equals("LTORG")) {
                System.out.println(LC + "\tLTORG\t(AD,05)");

                for (int i = 0; i < literalTable.size(); i++) {
                    literalAddress.set(i, LC);
                    System.out.println(LC + "\tLiteral " + literalTable.get(i));
                    LC++;
                }
            }

            else if (tokens[0].equals("END")) {
                System.out.println(LC + "\tEND\t(AD,02)");
            }
        }

        br.close();

        // ----- Display Symbol Table -----
        System.out.println("\n----- SYMBOL TABLE -----");
        for (String s : symbolTable.keySet()) {
            System.out.println(s + " -> " + symbolTable.get(s));
        }

        // ----- Display Literal Table -----
        System.out.println("\n----- LITERAL TABLE -----");
        for (int i = 0; i < literalTable.size(); i++) {
            System.out.println(literalTable.get(i) + " -> " + literalAddress.get(i));
        }
    }
}
