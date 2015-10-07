package ua.martynenko.pattern.templatemethod.sample2;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class Main {
    public static void main(String[] args) {
//        CSVSorter sorter = new ToStringLengthCSVSorter();
//        4<sep>34<sep>123<sep>543<sep>322
//        y<sep>saa<sep>fsdk<sep>fsjl<sep>fjslfjsdkf
//        true<sep>true<sep>true<sep>false

//        CSVSorter sorter = new CountNumbersCSVSorter(",");
//        123,543,322,34,4
//        fjslfjsdkf,fsdk,fsjl,saa,y
//        true,true,false,true

        CSVSorter sorter = new FirstLetterCSVSorter();
//        123,34,322,4,543
//        fjslfjsdkf,fsdk,fsjl,saa,y
//        false,true,true,true



        System.out.println(sorter.sort("123,34,4,543,322"));
        System.out.println(sorter.sort("fjslfjsdkf,fsdk,fsjl,saa,y"));
        System.out.println(sorter.sort("true,true,false,true"));
    }
}
