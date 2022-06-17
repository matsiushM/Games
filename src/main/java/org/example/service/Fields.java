package org.example.service;

import java.util.Locale;
import java.util.Scanner;

public class Fields {


    public int[][] cell() {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String entity = scanner.nextLine();

        return fieldType(entity,line);

    }

    private int[][] fieldType(String entity, String line) {

        int[][] box = new int[4][4];
        int offSet = 0;
        String latter = "";

        if (entity.toLowerCase(Locale.ROOT).equals("human")) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    latter = line.substring(offSet, ++offSet);
                    if (latter.toLowerCase(Locale.ROOT).contains("s")) {
                        box[i][j] = 5;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("w")) {
                        box[i][j] = 2;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("t")) {
                        box[i][j] = 3;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("p")) {
                        box[i][j] = 1;
                    }
                }

            }
        }
        if (entity.toLowerCase(Locale.ROOT).equals("swamper")) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    latter = line.substring(offSet, ++offSet);
                    if (latter.toLowerCase(Locale.ROOT).contains("s")) {
                        box[i][j] = 2;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("w")) {
                        box[i][j] = 2;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("t")) {
                        box[i][j] = 5;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("p")) {
                        box[i][j] = 2;
                    }
                }

            }
        }
        if (entity.toLowerCase(Locale.ROOT).equals("woodman")) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    latter = line.substring(offSet, ++offSet);
                    if (latter.toLowerCase(Locale.ROOT).contains("s")) {
                        box[i][j] = 3;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("w")) {
                        box[i][j] = 3;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("t")) {
                        box[i][j] = 2;
                        continue;
                    }
                    if (latter.toLowerCase(Locale.ROOT).contains("p")) {
                        box[i][j] = 2;
                    }
                }

            }
        }
        return box;
    }

}

