static void writeTotal(PrintWriter outfile, int lines, int[] letters){

    int i;
    
    outfile.println();
    outfile.println("The number of lines = " +lines);

    for(i = 0; i < 26; i++)
        outfile.println((char)(i+65) + " count = " + letters[i]);

}
