//Student ID: D210187C
//Student Name: Chong Shao Yi
//Batch no: IT21C
//Submission Date: 13/1/2022

//Title: Bus Ticket Booking System

//Project Objective:
//- During the pandemic, in order to avoid the risk of infection customers can book bus tickets through the bus ticket booking system.
//- Bus Ticket Booking System makes the bus seat reservation process more simple just using phone or computer.
//- Easy to use and enable customers to check the seat reservation. 

//Description:
// This is a program that can be used for bus ticket booking. Below are the following function:
// a)Users can enter how many tickets they would like to buy and select the seat they would like to choose. 
// b)Users can enter how many tickets they would like to cancel and select the seat they would like to cancel.
// c)The program will show "The seat has been booked." when the user selects a booked seat.
// d)The program will show "The seat is empty." when the user cancels an empty seat.
// e)The program can show seat conditions for users to check the seat condotion.
// f)The program will return to main menu after the process is completed.
// g)The program is ended when the user choose to Quit the program. 

//Structure Review:
// a)'method' to arrange the function of the program
// b)'switch' to let user enter their choice and redirect it to its method function 
// c)'if-else' to display output based on condition
// d)'array' to identified the seat
// e)'loop' to repeat the function and return to main menu




import java.util.Scanner;

public class IT_FSDD_2021C_Project_D210187C {
	
    public static String A[] = new String[10];
    public static String B[] = new String[10];
    public static String C[] = new String[10];
    public static String D[] = new String[10];
    
	public static void main(String[] args){
		
    	for (int a = 1; a <= 9; a++) {
            A[a] = "A";
        }
        for (int a = 1; a <= 9; a++) {
            B[a] = "B";
        }
        for (int a = 1; a <= 9; a++) {
            C[a] = "C";
        }
        for (int a = 1; a <= 9; a++) {
            D[a] = "D";
        }
        
    	Scanner input = new Scanner(System.in);
    	System.out.println("Welcome to Wonderful Bus.");
    	System.out.println("The best bus service for yout trip.");
    	System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("");
        System.out.println(" "+" "+" Welcome," + name);
        int out = 0;
             
             do{
             	System.out.println(" << main menu >>");
 	            System.out.println("[1]Booking the seat.");
 	            System.out.println("[2]Cancel the seat.");
 	            System.out.println("[3]Check seat condition.");
 	            System.out.println("[4]Quit.");
 	            System.out.print("Enter your choice(1-4): ");
 	            int way = input.nextInt();
 	            switch (way) {
 	            	case 1:
 			            Booking();
 			            break;
 		            case 2:
 			            Cancel();
 			            break;
 		            case 3:
 			            Check();
 			            break;
 		            case 4:
 			            Quit();
 			            out++;
 			            break;
 		            default:
 			            System.out.println("Something went wrong.");		
 	                }
 	           }while(out<=0);
 }
 
  public static void Booking(){
  
  	Scanner input = new Scanner(System.in);
 	System.out.print("Enter the number of ticket (e.g.: 1) : ");
 	int numberOfTicketBooking = input.nextInt();
 	String thank = "Ticket reservation successfully.";
 	String booked = "The seat has been booked.";
 	
 	for(int i = 0;i<numberOfTicketBooking;i++){	
        System.out.println(" ROW        SEAT     ");
        System.out.println("  1  =  |A|B|  |C|D| ");
        System.out.println("  2  =  |A|B|  |C|D| ");
        System.out.println("  3  =  |A|B|  |C|D| ");
        System.out.println("  4  =  |A|B|  |C|D| ");
        System.out.println("  5  =  |A|B|  |C|D| ");
        System.out.println("  6  =  |A|B|  |C|D| ");
        System.out.println("  7  =  |A|B|  |C|D| ");
        System.out.println("  8  =  |A|B|  |C|D| ");
        System.out.println("  9  =  |A|B|  |C|D| ");
        System.out.println("");
    
        System.out.print("Enter the row  (1-9) : ");
        int row = input.nextInt();
        System.out.print("Enter the seat (A-D) : ");
        String seat = input.next();
 	        
        if (row <= 9 && row > 0 && "A".equals(seat) || "a".equals(seat)) {
                if ("A"!=(A[row])) {
                    System.out.println(booked);
                } else {
                    A[row] = "X";
                    System.out.println(thank);
                }
            } else if (row <= 9 && row > 0 && "B".equals(seat) || "b".equals(seat)) {
                if ("B"!=(B[row])) {
                    System.out.println(booked);
                } else {
                    B[row] = "X";
                    System.out.println(thank);
                }
            } else if (row <= 9 && row > 0 && "C".equals(seat) || "c".equals(seat)) {
                if ("C"!=(C[row])) {
                    System.out.println(booked);
                } else {
                    C[row] = "X";
                    System.out.println(thank);
                }
            } else if (row <= 9 && row > 0 && "D".equals(seat) || "d".equals(seat)) {
                if ("D"!=(D[row])) {
                    System.out.println(booked);
                } else {
                    D[row] = "X";
                    System.out.println(thank);
                }
            }else {
                System.out.println("Something went wrong.");
            }
    }
    
 	System.out.println("Thank you for choosing us.");
 	System.out.println("");
  }
  
  public static void Cancel(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of ticket would you like to cancel (e.g.: 1) : ");
    int ticketDelete = input.nextInt();
    String recall = "Cancelation completed.";
    String empty = "The seat is empty.";
  	
    for(int i = 0;i<ticketDelete;i++){
    	System.out.println(" ROW       	SEAT     ");
        System.out.println("  1  =  |" + A[1]+"|"+B[1]+"|  |"+C[1]+"|"+D[1]+ "|");
        System.out.println("  2  =  |" + A[2]+"|"+B[2]+"|  |"+C[2]+"|"+D[2]+ "|");
        System.out.println("  3  =  |" + A[3]+"|"+B[3]+"|  |"+C[3]+"|"+D[3]+ "|");
        System.out.println("  4  =  |" + A[4]+"|"+B[4]+"|  |"+C[4]+"|"+D[4]+ "|");
        System.out.println("  5  =  |" + A[5]+"|"+B[5]+"|  |"+C[5]+"|"+D[5]+ "|");
        System.out.println("  6  =  |" + A[6]+"|"+B[6]+"|  |"+C[6]+"|"+D[6]+ "|");
        System.out.println("  7  =  |" + A[7]+"|"+B[7]+"|  |"+C[7]+"|"+D[7]+ "|");
        System.out.println("  8  =  |" + A[8]+"|"+B[8]+"|  |"+C[8]+"|"+D[8]+ "|");
        System.out.println("  9  =  |" + A[9]+"|"+B[9]+"|  |"+C[9]+"|"+D[9]+ "|");
        System.out.println("");
    
        System.out.print("Please Enter the Row (1-9) : ");
        int row = input.nextInt();
        System.out.print("Please Enter the Seat (A-D): ");
        String seat = input.next();
        
        if (row <= 9 && row > 0 && "A".equals(seat) || "a".equals(seat)) {
                if ("X"!=(A[row])) {
                    System.out.println(empty);
                } else {
                    A[row] = "A";
                    System.out.println(recall);
                }
            } else if (row <= 9 && row > 0 && "B".equals(seat) || "b".equals(seat)) {
                if ("X"!=(B[row])) {
                    System.out.println(empty);
                } else {
                    B[row] = "B";
                    System.out.println(recall);
                }
            } else if (row <= 9 && row > 0 && "C".equals(seat) || "c".equals(seat)) {
                if ("X"!=(C[row])) {
                    System.out.println(empty);
                } else {
                    C[row] = "C";
                    System.out.println(recall);
                }
            } else if (row <= 9 && row > 0 && "D".equals(seat) || "d".equals(seat)) {
                if ("X"!=(D[row])) {
                    System.out.println(empty);
                } else {
                    D[row] = "D";
                    System.out.println(recall);
                }
            } else {
                System.out.println("Something went wrong.");
            }      
    }
    
    System.out.println("");
  }
  
  public static void Check(){
    System.out.println("");
    System.out.println(" <<Seat condition>>");
    System.out.println("");
    System.out.println(" ROW       	SEAT     ");
    System.out.println("  1  =  |" + A[1]+"|"+B[1]+"|  |"+C[1]+"|"+D[1]+ "|");
    System.out.println("  2  =  |" + A[2]+"|"+B[2]+"|  |"+C[2]+"|"+D[2]+ "|");
    System.out.println("  3  =  |" + A[3]+"|"+B[3]+"|  |"+C[3]+"|"+D[3]+ "|");
    System.out.println("  4  =  |" + A[4]+"|"+B[4]+"|  |"+C[4]+"|"+D[4]+ "|");
    System.out.println("  5  =  |" + A[5]+"|"+B[5]+"|  |"+C[5]+"|"+D[5]+ "|");
    System.out.println("  6  =  |" + A[6]+"|"+B[6]+"|  |"+C[6]+"|"+D[6]+ "|");
    System.out.println("  7  =  |" + A[7]+"|"+B[7]+"|  |"+C[7]+"|"+D[7]+ "|");
    System.out.println("  8  =  |" + A[8]+"|"+B[8]+"|  |"+C[8]+"|"+D[8]+ "|");
    System.out.println("  9  =  |" + A[9]+"|"+B[9]+"|  |"+C[9]+"|"+D[9]+ "|");
    System.out.println("");
  }
  
  public static void Quit(){
    System.out.println("");
    System.out.println("<<< You are leaving. >>>"); 
    System.out.println("");   	
    System.out.println("   <<< THANK YOU >>>");
	}
}

 