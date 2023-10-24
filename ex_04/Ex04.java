package ex_04;

public class Ex04 {
    public static void printMovieFromNbr(Integer nbr){
    switch(nbr){
   
        case 3: 
            System.out.println("The Three Brothers");
            break;
    
        case 6:
            System.out.println("The Sixth Sense");
            break;
    
        case 23:
            System.out.println("The Number 23");
            break;

        case 28:
            System.out.println("The Number 28");
            break;
        default:
            System.out.println("I don't know.");
            break;
    }
}
}
