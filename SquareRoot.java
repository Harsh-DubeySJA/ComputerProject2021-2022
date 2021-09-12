class SquareRoot{
    public static double abs(double x){
        return x>0?x:-x;
    }
    public static double sqrt(double x){
        double guess=0, step=1, square;
        do{
            square = guess*guess;
            if(abs(x-square)<0.0000000001 ){
                break;
            }else if(square>x){
                guess -= step;
                step=step/10;
            }
            guess+=step;
        }while(true);
        return guess;
    }
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25)+"\t"+sqrt(25));
        System.out.println(Math.sqrt(26)+"\t"+sqrt(26));

    }

}