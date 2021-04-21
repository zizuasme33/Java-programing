package OfficeHoursday1.Practice_day_7_March17_2021;

public class CyberteckBatches {
    public static void main(String[] args) {
        String batchType = "US"; // EU

        if (batchType.equals("US") || batchType.equals("us") ) {
            boolean isMorning = false; // we put here because it belongs only in US other wise we can put on the top
            if (isMorning) {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");

        }else if (batchType.equals("EU") || batchType.equals("eu")) {

                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");

            } else {
                System.out.println("Invalid batch");
            }

        }


    }
}



//n Cybertek we have three batch types: US morning, US evening, EU.
//Depending on a batch type (String) print information about the batch.
//
//First figure out is is a US batch or EU batch
//
//    - for US batches:
//
//Figure out is it a morning batch or evening batch
//morning - print: Class times are 10-5 EST. M, T, Th, F.
//evening - print: Class times are 7-10 EST. M, T, W, Th, S, S
//
//    - for EU batches:
//
//print: Class times are  10-5 EST. M, T, W, Th, F.