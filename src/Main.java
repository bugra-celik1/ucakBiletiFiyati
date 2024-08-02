import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int distance,age,tripType;

    double totalPrice = 0,normalPrice,discountedPrice,ageDiscount,roundTripDiscount;

    boolean isError = false;
    Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz:");
        distance = inp.nextInt();
        System.out.print("Yaşınızı giriniz:");
        age = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tripType = inp.nextInt();

        normalPrice = distance * 0.10;


if(tripType <=2 && tripType >=1 && age > 0 && distance >0) {
    if (age < 12) {
        ageDiscount = normalPrice * 0.5;
        discountedPrice = normalPrice - ageDiscount;
        if (tripType == 2) {
            roundTripDiscount = discountedPrice * 0.2;
            totalPrice = (discountedPrice - roundTripDiscount) * 2;
        } else {
            totalPrice = discountedPrice;
        }
    } else if (age < 24 && age > 12) {
        ageDiscount = normalPrice * 0.1;
        discountedPrice = normalPrice - ageDiscount;
        if (tripType == 2) {
            roundTripDiscount = discountedPrice * 0.2;
            totalPrice = (discountedPrice - roundTripDiscount) * 2;
        } else {
            totalPrice = discountedPrice;
        }
    } else if (age > 65) {
        ageDiscount = normalPrice * 0.3;
        discountedPrice = normalPrice - ageDiscount;
        if (tripType == 2) {
            roundTripDiscount = discountedPrice * 0.2;
            totalPrice = (discountedPrice - roundTripDiscount) * 2;
        } else {
            totalPrice = discountedPrice;
        }
    }
    else if( age >=24){
        if (tripType == 2) {
            roundTripDiscount = normalPrice * 0.2;
            totalPrice = (normalPrice - roundTripDiscount) * 2;
        } else {
            totalPrice = normalPrice;
        }
    }
}else{
    isError = true;
}
        if(isError){
            System.out.println("Hatalı veri girdiniz !");
        }else {
            System.out.println("Toplam tutar :" + totalPrice +"TL");

        }

    }
}