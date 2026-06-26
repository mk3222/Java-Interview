void main() {
        /* double sq = Math.sqrt(25);
         System.out.println("The Square Root of 25 is " + sq);
        */
    int num = 9;
    double temp;
    double sr = (double) num / 2; // 9/2 = 4
    do {
        temp = sr; // 4, 3
        sr = (temp + (num / temp)) / 2;
        // (4+(9/4))/2 = (4+2)/2 = 3
        // (3+(9/3))/2 = (3+3)/2 = 3
    }
    while ((temp - sr != 0));
    IO.println("The Square Root of 9 is " + sr);
}
