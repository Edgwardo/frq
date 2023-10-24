public class Distance
{
    public static void main(String[] args)
    {
            double kilometers=10;
            double miles;
            double leauges;
            Distance toMiles;{
                miles = kilometers/1.609;
                System.out.println(kilometers + "km = " + miles + " miles");

            }
            Distance toLeauges;{
                leauges = kilometers/5.556;
                System.out.println(kilometers + "km = " + leauges + " leauges");
            }
            Distance doubleMiles;{
                System.out.println(kilometers + "km = " + miles*2 + " miles (round trip)");
            }
            Distance getKilometers;{
                System.out.println(kilometers + "km");
            }
        
        }
    }
