//package descifrado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HablandoEnLenguas {    
    public static void main(String[] args) {
        String file_in_dir = args[0];
        try {
                File file_in  = new File(file_in_dir);
                File file_out = new File(file_in.getParentFile().toString(), "HablandoEnLenguas_201222591.txt");
                file_out.createNewFile();
                FileReader file_reader = new FileReader(file_in);
                BufferedReader buffered_reader = new BufferedReader(file_reader);
                FileWriter file_writer = new FileWriter(file_out);
                PrintWriter print_writer = new PrintWriter(file_writer);
                
                String line_in = "";
                String line_out = "";
                String aux = "";
                int line_count = 0;
                int c = 0;

                
                while(line_in != null) {
                    line_in = line_in.toUpperCase();
                    if(line_count == 0) {
                        line_in = buffered_reader.readLine();
                    }
                    else {
                        line_out = "Caso #" + c +": ";
                        for(int i = 0; i < line_in.length(); i++) {
                            if(line_in.charAt(i) == 'A') {
                                line_out = line_out + 'Y';
                            }
                            if(line_in.charAt(i) == 'B') {
                                line_out = line_out + 'H';
                            }
                            if(line_in.charAt(i) == 'C') {
                                line_out = line_out + 'E';
                            }
                            if(line_in.charAt(i) == 'D') {
                                line_out = line_out + 'S';
                            }
                            if(line_in.charAt(i) == 'E') {
                                line_out = line_out + 'O';
                            }
                            if(line_in.charAt(i) == 'F') {
                                line_out = line_out + 'C';
                            }
                            if(line_in.charAt(i) == 'G') {
                                line_out = line_out + 'V';
                            }
                            if(line_in.charAt(i) == 'H') {
                                line_out = line_out + 'X';
                            }
                            if(line_in.charAt(i) == 'I') {
                                line_out = line_out + 'D';
                            }
                            if(line_in.charAt(i) == 'J') {
                                line_out = line_out + 'U';
                            }
                            if(line_in.charAt(i) == 'K') {
                                line_out = line_out + 'I';
                            }
                            if(line_in.charAt(i) == 'L') {
                                line_out = line_out + 'G';
                            }
                            if(line_in.charAt(i) == 'M') {
                                line_out = line_out + 'L';
                            }
                            if(line_in.charAt(i) == 'N') {
                                line_out = line_out + 'B';
                            }
                            if(line_in.charAt(i) == 'O') {
                                line_out = line_out + 'K';
                            }
                            if(line_in.charAt(i) == 'P') {
                                line_out = line_out + 'R';
                            }
                            if(line_in.charAt(i) == 'Q') {
                                line_out = line_out + 'Z';
                            }
                            if(line_in.charAt(i) == 'R') {
                                line_out = line_out + 'T';
                            }
                            if(line_in.charAt(i) == 'S') {
                                line_out = line_out + 'N';
                            }
                            if(line_in.charAt(i) == 'T') {
                                line_out = line_out + 'W';
                            }
                            if(line_in.charAt(i) == 'U') {
                                line_out = line_out + 'J';
                            }
                            if(line_in.charAt(i) == 'V') {
                                line_out = line_out + 'P';
                            }
                            if(line_in.charAt(i) == 'W') {
                                line_out = line_out + 'F';
                            }
                            if(line_in.charAt(i) == 'X') {
                                line_out = line_out + 'M';
                            }
                            if(line_in.charAt(i) == 'Y') {
                                line_out = line_out + 'A';
                            }
                            if(line_in.charAt(i) == 'Z') {
                                line_out = line_out + 'Q';
                            }
                            if(line_in.charAt(i) == ' ') {
                                line_out = line_out + ' ';
                            }
                        }                        
                        System.out.println(line_out);
                        print_writer.println(line_out);
                        line_out = "";
                    }
                    line_count++;
                    line_in = buffered_reader.readLine();
                    c++;
                }
                buffered_reader.close();
                file_reader.close();
                print_writer.close();
                file_writer.close();
        }
        catch(IOException e){
            System.err.println("El archivo no existe o no puede ser leído");
        }
    }
}
