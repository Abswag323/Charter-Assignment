package com.charter.Charter.Rewards.controllers;

import com.charter.Charter.Rewards.models.Transactions;
import com.charter.Charter.Rewards.utility.TransactionData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;


@Controller
public class RewardsController {

    @GetMapping("")
    public String getRewardsPoints (Model model) {
        HashMap<Integer, Integer> customerRewards = new HashMap<>();

        for (Transactions transaction : TransactionData.createTransactions()) {

            LocalDate endDate = LocalDate.now().minusMonths(3);
            if (transaction.getTransactionDate().isAfter(endDate)) {

                Integer rewards = customerRewards.get(transaction.getCustomerID());

                if (!customerRewards.containsKey(transaction.getCustomerID())) {
                    customerRewards.put(transaction.getCustomerID(), transaction.getRewardsPointsEarned());
                } else {
                        rewards += transaction.getRewardsPointsEarned();

                        customerRewards.put(transaction.getCustomerID(), rewards);

                }
            }

        }

        model.addAttribute("rewardPoints", customerRewards);
        return "index";

    }

}
