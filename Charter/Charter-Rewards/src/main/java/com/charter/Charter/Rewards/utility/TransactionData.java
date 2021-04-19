package com.charter.Charter.Rewards.utility;

import com.charter.Charter.Rewards.models.Transactions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionData {

    private static List<Transactions> transactionsList = new ArrayList<>();

    public static List<Transactions> createTransactions () {
        transactionsList.add(new Transactions(1, LocalDate.of(2021,04,04), 35.16, 1)); //test amount under $50
        transactionsList.add(new Transactions(2, LocalDate.of(2020, 06, 30), 308.90, 2)); //test date over 3 months
        transactionsList.add(new Transactions(3, LocalDate.of(2020, 9, 01), 243.76, 3));
        transactionsList.add(new Transactions(4, LocalDate.of(2020, 9, 9),439.42, 4));
        transactionsList.add(new Transactions(5, LocalDate.of(2021, 03, 20), 321.92, 5)); //test amount over $100
        transactionsList.add(new Transactions(6, LocalDate.of(2021, 02, 23), 96.98, 4)); //test amount between 51 and 99
        transactionsList.add(new Transactions(7, LocalDate.of(2021, 03, 10), 134.20, 3));
        transactionsList.add(new Transactions(8, LocalDate.of(2021, 03, 30),373.08, 2));
        transactionsList.add(new Transactions(9, LocalDate.of(2021, 01, 04), 296.83, 1));
        transactionsList.add(new Transactions(10, LocalDate.of(2021, 03, 22), 349.20, 2));
        transactionsList.add(new Transactions(11, LocalDate.of(2021, 01, 27), 20.41, 3));
        transactionsList.add(new Transactions(12, LocalDate.of(2021, 03, 29), 268.52, 4));
        transactionsList.add(new Transactions(13, LocalDate.of(2021, 02, 03), 398.67, 5));
        transactionsList.add(new Transactions(14, LocalDate.of(2021, 01, 19), 252.71, 4));
        transactionsList.add(new Transactions(15, LocalDate.of(2021, 01, 25), 190.06, 3));
        transactionsList.add(new Transactions(16, LocalDate.of(2021, 02, 02), 231.91, 2));
        transactionsList.add(new Transactions(17, LocalDate.of(2021, 01, 15), 146.43, 1));
        transactionsList.add(new Transactions(18, LocalDate.of(2021, 02, 27), 279.27, 2));
        transactionsList.add(new Transactions(19, LocalDate.of(2021, 02, 01), 491.72, 3));
        transactionsList.add(new Transactions(20, LocalDate.of(2021, 03, 05), 216.38, 4));
        transactionsList.add(new Transactions(21, LocalDate.of(2021, 03, 9), 136.19, 5));
        transactionsList.add(new Transactions(22, LocalDate.of(2021, 02, 18), 83.51, 4));
        transactionsList.add(new Transactions(23, LocalDate.of(2021, 01, 11), 495.77, 3));
        transactionsList.add(new Transactions(24, LocalDate.of(2020, 02, 11), 473.53, 2));
        transactionsList.add(new Transactions(25, LocalDate.of(2021, 02, 23), 239.18, 1));
        transactionsList.add(new Transactions(26, LocalDate.of(2021, 02, 27), 434.67, 2));
        transactionsList.add(new Transactions(27, LocalDate.of(2021, 03, 04), 390.96, 3));
        transactionsList.add(new Transactions(28, LocalDate.of(2021, 02, 16), 132.40, 4));
        transactionsList.add(new Transactions(29, LocalDate.of(2021, 04, 02), 476.34, 5));
        transactionsList.add(new Transactions(30, LocalDate.of(2020, 03, 20), 156.46, 4));
        transactionsList.add(new Transactions(31, LocalDate.of(2020, 9, 16), 230.57, 3));
        transactionsList.add(new Transactions(32, LocalDate.of(2021, 01, 18), 70.39, 2));
        transactionsList.add(new Transactions(33, LocalDate.of(2021, 01, 22), 268.20, 1));
        transactionsList.add(new Transactions(34, LocalDate.of(2021, 01, 30), 311.72, 2));
        transactionsList.add(new Transactions(35, LocalDate.of(2020, 8, 28), 382.31, 3));
        transactionsList.add(new Transactions(36, LocalDate.of(2021, 01, 01), 499.97, 4));
        transactionsList.add(new Transactions(37, LocalDate.of(2021, 01, 25), 196.32, 5));
        transactionsList.add(new Transactions(38, LocalDate.of(2020, 06, 21), 477.26, 4));
        transactionsList.add(new Transactions(39, LocalDate.of(2021, 02, 17), 126.27, 3));
        transactionsList.add(new Transactions(40, LocalDate.of(2021, 02, 23), 21.59, 2));
        transactionsList.add(new Transactions(41, LocalDate.of(2021, 02, 14), 384.42, 1));
        transactionsList.add(new Transactions(42, LocalDate.of(2021, 03, 22), 469.24, 2));
        transactionsList.add(new Transactions(43, LocalDate.of(2021, 04, 06), 97.61, 3));
        transactionsList.add(new Transactions(44, LocalDate.of(2020, 11, 25), 371.63, 4));
        transactionsList.add(new Transactions(45, LocalDate.of(2021, 02, 14), 417.09, 5));
        transactionsList.add(new Transactions(46, LocalDate.of(2020, 12, 31), 106.75, 4));
        transactionsList.add(new Transactions(47, LocalDate.of(2021, 04, 02), 160.23, 3));
        transactionsList.add(new Transactions(48, LocalDate.of(2021, 01, 10), 406.38, 2));
        transactionsList.add(new Transactions(49, LocalDate.of(2021, 01, 17), 320.43, 1));
        transactionsList.add(new Transactions(50, LocalDate.of(2021, 02, 22), 238.70, 2));

        return transactionsList;
    }


}
