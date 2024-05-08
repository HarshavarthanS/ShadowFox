package pack;
import java.util.Scanner;
import java.math.*;

public class Calculator {
 	  
		public static void main(String[] args) {
			System.out.println("---------CONSOLE BASED CALCULATOR----------");
			System.out.println("CHOOSE AN OPERATIONS ");
			System.out.println("1.BASIC CALCULATION");
			System.out.println("2.SCIENTIFIC CALCULATION");
			System.out.println("3.UNIT CONVERSION");
			System.out.print("ENTER THE OPERATION :");
			Scanner sc = new Scanner(System.in);
			char choice= sc.next().charAt(0);
			try {
				
			
			switch(choice) {
			case '1':
				arithmetic();
				break;
			case '2':
				scientific_calculation();
				break;
			case '3':
				unit_conversions();
				break;
			default:
				System.out.println("\nINVALID OPTION");
			}
			}
			catch(Exception e) {
				System.out.println("");
			}
			
		}
			
		static void arithmetic() {
			 System.out.println("-----------BASIC CALCULATIONS------------");
			 Scanner sc = new Scanner(System.in);
			 double result;
			 do { 
					 System.out.print("\nENTER THE FIRST NUMBER :");
					 double num1 = sc.nextDouble();
					 System.out.print("\nENTER THE OPERATORS (+,-,*,/) :");
					 char op = sc.next().charAt(0);
					 System.out.print("\nENTER THE SECOND NUMBER :");
					 double num2 =sc.nextDouble();
					 System.out.println();
					 switch(op) {
					 case '+':
						 result=num1+num2;
						 System.out.println(num1+" + "+num2+" = "+result);
						 System.out.print("\nDO YOU WANT CALCULATE DIFFERENT OPERATOR  (Y/N) :");
						 
						 if(sc.next().equalsIgnoreCase("y")) {
							 repeat(result);
							 break;
						 }
						 else {
							 System.out.println();
						 }
						 
						 break;
					 case '-':
						 result=num1-num2;
						 System.out.println(num1+" - "+num2+" = "+result);
						 System.out.print("\nDO YOU WANT CALCULATE DIFFERENT OPERATOR (Y/N) :");
						 
						 if(sc.next().equalsIgnoreCase("y")) {
							 repeat(result);
							 break;
							 
						 }
						 else {
							 System.out.println();
						 }
						 
						 break;
					 case '*':
						 result=num1*num2;
						 System.out.println(num1+" * "+num2+" = "+result);
						 System.out.print("\nDO YOU WANT CALCULATE DIFFERENT OPERATOR  (Y/N) :");
						 
						 if(sc.next().equalsIgnoreCase("y")) {
							 repeat(result);
							 break;
							 
						 }
						 else {
							 System.out.println();
						 }
						 break;
					 case '/':
						 if(num2!=0) {
							 result=num1/num2;
							 System.out.println(num1+" / "+num2+" = "+result);
							 System.out.print("\nDO YOU WANT CALCULATE DIFFERENT OPERATOR  (Y/N) :");
							 
							 if(sc.next().equalsIgnoreCase("y")) {
								 repeat(result);
								 break;
								 
							 }
							 else {
								 System.out.println();
							 }
						 }
						 else {
							 System.out.println(" ERROR : DIVISION BY ZERO ");
						 }
						 break;
					 default:
						 System.out.println("INVALID OPERATOR");
						 break;
					 }
					 System.out.println();
					 System.out.print("DO YOU WANT TO QUIT (Y/N) :");
			 }while(sc.next().equalsIgnoreCase("n"));
			 System.out.println("\n-----------THANK  YOU--------------------");
			  
	 
		}
		static void repeat(double res) {
			Scanner sc=new Scanner(System.in);
			double result=0;
			 
			do { 
				 
				 System.out.print("\nENTER THE NUMBER :");
				 double num1 = sc.nextDouble();
				 System.out.print("\nENTER THE OPERATORS(+,-,*,/) :");
				 char op = sc.next().charAt(0);
				 System.out.println();
				 switch(op) {
				 case '+':
					 result=res+num1;
					 System.out.println(res+" + "+num1+" = "+result);
					 break;
				 case '-':
					 result=res-num1;
					 System.out.println(res+" - "+num1+" = "+result);
					 break;
				 case '*':
					 result=res*num1;
					 System.out.println(res+" * "+num1+" = "+result);
					 break;
				 case '/':
					 if(num1!=0) {
						 result=res/num1;
						 System.out.println(res+" / "+num1+" = "+result);
					 }
					 else {
						 System.out.println(" ERROR : DIVISION BY ZERO ");
					 }
					 break;
				 default:
					 System.out.println("invalid operator :");
					 break;
				 }
	 			 System.out.print("DO YOU WANT TO CONTINUE (Y/N) :");
				 res=result;
				 
				 
				 }
			while(sc.next().equalsIgnoreCase("y"));
				 
			
			
		
		}
		static void scientific_calculation(){
			System.out.println("-------SCIENTIFIC CALCULATION------");
			double result;
			Scanner sc=new Scanner(System.in);
			do {
				
			System.out.println("\nCHOOSE AN OPERATION ");
			System.out.println("1.SQUARE ROOT");
			System.out.println("2.POWER");
			System.out.println("3.FACTORIAL");
			System.out.print("ENTER THE OPERATION :");
			char op =sc.next().charAt(0);
 			switch(op) {
			case '1': 
				 sqrt();
				 break;
			
 			case '2':
 				power();
 				break;
 			case '3':
 				factorial();
 				break;
 			default:
 				System.out.println("\ninvalid option");
 				break;
 					}
 			System.out.print("\nDO YOU WANT CONTINUE (Y/N):");
			}while(sc.next().equalsIgnoreCase("y"));
			System.out.println("\n-----THANK YOU------");
			
		}
		static void sqrt() {
			Scanner sc=new Scanner(System.in);
			System.out.print("\nENTER THE NUMBER :");
			double num =sc.nextDouble();
			double result =Math.sqrt(num);
			System.out.println("\nTHE SQUARE ROOT OF "+num+" IS :"+result);
 		}
		static void power() {
			Scanner sc =new Scanner(System.in);
			double result;
			System.out.print("\nENTER THE  NUMBER :");
			double num1 =sc.nextDouble();
			System.out.print("\nENTER THE POWER VALUE :");
			double num2 =sc.nextDouble();
			result=Math.pow(num1, num2);
			System.out.println("\n"+num1+" ^ "+num2+" = "+result);
			
			
			
		}
		static void factorial() {
			System.out.print("\nENTER THE FACTORIAL NUMBER :");
			Scanner sc = new Scanner(System.in);
			double num = sc.nextDouble();
			double i,res = 1;
			for(i=1;i<=num;i++) {
				res*=i;
			}
			System.out.println("\nTHE FACTORIAL OF "+num+" is :"+res);
		}
		static void unit_conversions() {
			System.out.println("--------UNIT CONVERSION--------");
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("\nCHOOSE AN UNIT CONVERSION");
				System.out.println("\n1.TEMPERATURE");
				System.out.println("2.CURRENCY");
				System.out.println("3.LENGTH");
				System.out.print("\nENTER THE UNIT CONVERSION :");
				char option = sc.next().charAt(0);
				switch(option) {
				case '1':
					temperature();
					break;
				case '2':
					currency();
					break;
				case '3':
					length();
					break;
				
				default:
					System.out.println("\nINVALID OPERATION");
					break;
				}
				System.out.print("\nDO YOU WANT TO QUIT (Y/N):");
			}
			while(sc.next().equalsIgnoreCase("N"));
			System.out.println("\n--------THANK YOU--------");
			
			
		}
		static void temperature() {
			Scanner sc=new Scanner(System.in);
			double result;
		 	 do {
				 System.out.print("\nENTER THE DEGREE OF TEMPERATURE :");
				 double temp = sc.nextDouble();
				 System.out.println("\nCHOOSE A TEMPERATUE TYPE");
				 System.out.println("\n1.CELSIUS");
				 System.out.println("2.FAHRENHEIT");
				 System.out.println("3.KELVIN");
				 System.out.print("\nENTER THE TEMPERATURE TYPE:");
				 char op = sc.next().charAt(0);
				 System.out.println("\nCHOOSE A CONVERT TEMPERATUE TYPE");
				 System.out.println("\n1.CELSIUS");
				 System.out.println("2.FAHRENHEIT");
				 System.out.println("3.KELVIN");
				 System.out.print("\nENTER THE CONVERT TEMPERATURE TYPE:");
				 char convert = sc.next().charAt(0);
				 switch(op) {
				 case '1':
					 switch(convert) {
					 case '1':
						 result=temp+0;
						 System.out.println("\n"+temp+"°C"+" ---> "+result+"°C");
						 break;
					 case '2':
							result=(9.0/5.0)*temp+32;
							System.out.println("\n"+temp+"°C"+" ---> "+result+"°F");
							break;
					 case '3':
							result=temp+273.15;
							System.out.println("\n"+temp+"°C"+" ---> "+result+"K");
							break;
					 default:
							System.out.println("\nINVALID OPTION");
							break;	
					 }
					 break;
				 case '2':
					 switch(convert) {
					 case '1':
							result=(temp-32)*5.0/9.0;
							System.out.println("\n"+temp+"°F"+" ---> "+result+"°C");
							break;
					 case '2':
						 result= temp+0;
						 System.out.println("\n"+temp+"°F"+" ---> "+result+"°F");
						 break;
					 case '3':
							result=(temp-32)*(5.0/9.0)+273.15;
							System.out.println("\n"+temp+"°F"+" ---> "+result+"K");
							break;
					 default:
							System.out.println("\nINVALID OPTION");
							break;	
						 
					 }
					 break;
				 case '3':
					 switch(convert) {
					 case '1':
							result=temp-273.15;
							System.out.println("\n"+temp+"K"+" ---> "+result+"°C");
							break;
						case '2':
							result=(temp-273.15)*(9.0/5.0)+32;
							System.out.println("\n"+temp+"K"+" ---> "+result+"°F");
							break;
						case '3':
							result = temp+0;
							System.out.println("\n"+temp+"K"+" ---> "+result+"K");
						default:
							System.out.println("\nINVALID OPTION");
							break;	
					 }
					 
					 break;
				 default:
					 System.out.println("\nINVALID TEMPERATURE TYPE");
					 break;
						 
				 }
				 System.out.print("\nDO YOU WANT TO CONTINUE (Y/N) :");
			 }while(sc.next().equalsIgnoreCase("Y"));
		 
		}
		 
		static void currency() {
			Scanner sc = new Scanner(System.in);
			double result;
			do {
				System.out.print("\nENTER THE MONEY :");
				double money=sc.nextDouble();
				System.out.println("\nCHOOSE A CURRENCY TYPE ");
				System.out.println("\n1.INDIAN RUPEE");
				System.out.println("2.US DOLLAR");
				System.out.println("3.EURO");
				System.out.println("4.POUND");
				System.out.print("\nENTER THE CURRENCY TYPE :");
				char op = sc.next().charAt(0);
				System.out.println("\nCHOOSE A CONVERT CURRENCY TYPE ");
				System.out.println("\n1.INDIAN RUPEE");
				System.out.println("2.US DOLLAR");
				System.out.println("3.EURO");
				System.out.println("4.POUND");
				System.out.print("\nENTER THE CONVERT CURRENCY TYPE :");
				char convert = sc.next().charAt(0);
				switch(op) {
				case '1':
					switch(convert) {
					case '1':
						result=money*1;
						System.out.println("\n"+money+" INR --->  "+result+" INR");
						break;
					case '2':
						result=money*0.012;
						System.out.println("\n"+money+" INR --->  "+result+" US DOLLAR");
						break;
					case '3':
						result=money*0.011;
						System.out.println("\n"+money+" INR --->  "+result+" EURO");
						break;
					case '4':
						result=money*0.0096;
						System.out.println("\n"+money+" INR --->  "+result+" POUND");
						break;
					default:
						System.out.println("\nINVALID OPTION");
						break;

					}
					break;
				case '2':
					switch(convert) {
					case '1':
						result=money*83.38;
						System.out.println("\n"+money+" USD ---> "+result+" INR");
						break;
					case '2':
						result=money*1;
						System.out.println("\n"+money+" USD --->  "+result+" USD");
						break;
					case '3':
						result=money*0.93;
						System.out.println("\n"+money+" USD ---> "+result+" EURO");
						break;
					case '4':
						result=money*0.80;
						System.out.println("\n"+money+" USD  ---> "+result+" POUND");
						break;
					default:
						System.out.println("\nINVALID OPTION");
						break;
					
					}
					break;
				case '3':
					switch(convert) {
					case '1':
						result=money*89.83;
						System.out.println("\n"+money+" EURO --->  "+result+" INR");
						break;
					case '2':
						result=money*1.08;
						System.out.println("\n"+money+" EURO --->  "+result+" US DOLLAR");
						break;
					
					case '3':
						result=money*1;
						System.out.println("\n"+money+" EURO --->  "+result+" EURO");
						break;
						
					case '4':
						result=money*0.86;
						System.out.println("\n"+money+" EURO --->  "+result+" POUND");
						break;
					default:
						System.out.println("\nINVALID OPTION");
						break;
					}
					break;
				case '4':
					switch(convert) {
					case '1':
						result=money*104.63;
						System.out.println("\n"+money+" POUND ---> "+result+" INR");
						break;
					case '2':
						result=money*1.25;
						System.out.println("\n"+money+" POUND ---> "+result+" US DOLLAR");
						break;
					case '3':
						result=money*1.16;
						System.out.println("\n"+money+" POUND --->  "+result+" EURO");
						break;
					case '4':
						result=money*1;
						System.out.println("\n"+money+" POUND --->  "+result+" POUND");
						break;

					
					default:
						System.out.println("\nINVALID OPTION");
						break;
					}
					break;
				default:
					System.out.println("\nINVALID CURRENCY TYPE");
					break;
				}
				 System.out.print("\nDO YOU WANT TO CONTINUE (Y/N) :");
			}while(sc.next().equalsIgnoreCase("Y"));
		}
		static void length() {
			 Scanner sc =new Scanner(System.in);
			 double result;
			do {
			 System .out.print("\nENTER THE LENGTH :");
			 double  length= sc.nextDouble();
			 System.out.println("\nCHOOSE THE LENGTH TYPES :");
			 System.out.println("1.FOOT");
			 System.out.println("2.METERS");
			 System.out.println("3.MILLIMETRE");
			 System.out.println("4.CENTIMETRE");
			 System.out.println("5.INCH");
			 System.out.println("6.KILOMETRE");
			 System.out.print("\nENTER THE LENGTH TYPE :");
			 char op = sc.next().charAt(0);
			 System.out.println("\nCHOOSE THE CONVERT LENGTH TYPES :");
			 System.out.println("1.FOOT");
			 System.out.println("2.METERS");
			 System.out.println("3.MILLIMETRE");
			 System.out.println("4.CENTIMETRE");
			 System.out.println("5.INCH");
			 System.out.println("6.KILOMETRE");
			 System.out.print("\nENTER THE CONVERT LENGTH TYPE :");
			 char convert =sc.next().charAt(0);
			 switch(op) {
			 case '1':
				 switch(convert) {
				 case '1':
					 result=length*1;
					 System.out.println("\n"+length+"FOOT IS CONVERTED TO "+result+"FOOT");
					 break;
				 case '2':
					 result=length*0.3048;
					 System.out.println("\n"+length+"FOOT IS CONVERTED TO "+result+"METER");
					 break;
				 case '3':
					 result=length*304.8;
					 System.out.println("\n"+length+"FOOT IS CONVERTED TO "+result+"MILLIMETRE");
					 break;
				 case '4':
					 result=length*30.48;
					 System.out.println("\n"+length+"FOOT IS CONVERTED TO "+result+"CENTIMETRE");
					 break;
				 case '5':
					 result=length*12;
					 System.out.println("\n"+length+"FOOT IS CONVERTED TO "+result+"INCH");
					 break;
				 case '6':
					 result=length*0.0003048;
					 System.out.println("\n"+length+"FOOT IS CONVERTED TO "+result+"KILOMETRE");
					 break;
				 default:
						System.out.println("\nINVALID OPTION");
						break;
					 
				 }
				 break;
			 case '2':
				 switch(convert) {
				 case '1':
					 result=length*3.28084;
					 System.out.println("\n"+length+"METER IS CONVERTED TO "+result+"FOOT");
					 break;
				 case '2':
					 result=length*1;
					 System.out.println("\n"+length+"METER IS CONVERTED TO "+result+"METER");
					 break;
				 case '3':
					 result=length*1000;
					 System.out.println("\n"+length+"METER IS CONVERTED TO "+result+"MILLIMETRE");
					 break;
				 case '4':
					 result=length*100;
					 System.out.println("\n"+length+"METER IS CONVERTED TO "+result+"CENTIMETRE");
					 break;
				 case '5':
					 result=length*39.3701;
					 System.out.println("\n"+length+"METER IS CONVERTED TO "+result+"INCH");
					 break;
				 case '6':
					 result=length*0.001;
					 System.out.println("\n"+length+"METER IS CONVERTED TO "+result+"KILOMETRE");
					 break;
				 default:
						System.out.println("\nINVALID OPTION");
						break;
					 
				 }
				 break;
			 case '3':
				 switch(convert) {
				 case '1':
					 result=length*0.00328084;
					 System.out.println("\n"+length+"MM IS CONVERTED TO "+result+"FOOT");
					 break;
				 case '2':
					 result=length*0.001;
					 System.out.println("\n"+length+"MM IS CONVERTED TO "+result+"METER");
					 break;
				 case '3':
					 result=length*1;
					 System.out.println("\n"+length+"MM IS CONVERTED TO "+result+"MILLIMETRE");
					 break;
				 case '4':
					 result=length*0.1;
					 System.out.println("\n"+length+"MM IS CONVERTED TO "+result+"CENTIMETRE");
					 break;
				 case '5':
					 result=length*0.0393701;
					 System.out.println("\n"+length+"MM IS CONVERTED TO "+result+"INCH");
					 break;
				 case '6':
					 System.out.println("\nERROR:LARGE  DECIMAL VALUE");
					 break;
				 default:
						System.out.println("\nINVALID OPTION");
						break;
					 
				 }
				 break;
			 case '4':
				 switch(convert) {
				 case '1':
					 result=length*0.0328084;
					 System.out.println("\n"+length+"CM IS CONVERTED TO "+result+"FOOT");
					 break;
				 case '2':
					 result=length*0.01;
					 System.out.println("\n"+length+"CM IS CONVERTED TO "+result+"METER");
					 break;
				 case '3':
					 result=length*10;
					 System.out.println("\n"+length+"CM IS CONVERTED TO "+result+"MILLIMETRE");
					 break;
				 case '4':
					 result=length*1;
					 System.out.println("\n"+length+"CM IS CONVERTED TO "+result+"CENTIMETRE");
					 break;
				 case '5':
					 result=length*0.393701;
					 System.out.println("\n"+length+"CM IS CONVERTED TO "+result+"INCH");
					 break;
				 case '6':
					 System.out.println("\nERROR:LARGE  DECIMAL VALUE");
					 break;
				 default:
						System.out.println("\nINVALID OPTION");
						break;
					 
				 }
				 break;
			 case '5':
				 switch(convert) {
				 case '1':
					 result=length*0.0833333;
					 System.out.println("\n"+length+"INCH IS CONVERTED TO "+result+"FOOT");
					 break;
				 case '2':
					 result=length*0.0254;
					 System.out.println("\n"+length+"INCH IS CONVERTED TO "+result+"METER");
					 break;
				 case '3':
					 result=length*25.4;
					 System.out.println("\n"+length+"INCH IS CONVERTED TO "+result+"MILLIMETRE");
					 break;
				 case '4':
					 result=length*2.54;
					 System.out.println("\n"+length+"INCH IS CONVERTED TO "+result+"CENTIMETRE");
					 break;
				 case '5':
					 result=length*1;
					 System.out.println("\n"+length+"INCH IS CONVERTED TO "+result+"INCH");
					 break;
				 case '6':
					 System.out.println("\nERROR:LARGE  DECIMAL VALUE");
					 break;
				 default:
						System.out.println("\nINVALID OPTION");
						break;
					 
				 }
				 break;
			 case '6':
				 switch(convert) {
				 case '1':
					 result=length*3280.84;
					 System.out.println("\n"+length+"KM IS CONVERTED TO "+result+"FOOT");
					 break;
				 case '2':
					 result=length*1000;
					 System.out.println("\n"+length+"KM IS CONVERTED TO "+result+"METER");
					 break;
				 case '3':
					 System.out.println("\nERROR:LARGE VALUE");
					 break;
				 case '4':
					 result=length*100000;
					 System.out.println("\n"+length+"KM IS CONVERTED TO "+result+"CENTIMETRE");
					 break;
				 case '5':
					 result=length*39370.1;
					 System.out.println("\n"+length+"KM IS CONVERTED TO "+result+"INCH");
					 break;
				 case '6':
					 result=length*1;
					 System.out.println("\n"+length+"KM IS CONVERTED TO "+result+"KILOMETRE");	  
					 break;
				default:
					System.out.println("\nINVALID OPTION");
					break;
					 
				 }
				 break;
			 default:
				 System.out.println("\nINVALID LENGHT TYPE");
				 break;
			 }
			 System.out.print("\nDO YOU WANT TO CONTINUE (Y/N) :");
		}while(sc.next().equalsIgnoreCase("Y"));
			 

		}
			  
			  
		 
	}
			 





