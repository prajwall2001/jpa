package com.xworkz.fertilizerJpa.boot;

import com.xworkz.fertilizerJpa.entity.ConditionerEntity;
import com.xworkz.fertilizerJpa.repo.ConditionerRepository;
import com.xworkz.fertilizerJpa.repo.ConditionerRepositoryImpl;

import java.util.Arrays;
import java.util.List;

public class  ConditionerRunner {
    public static void main(String[] args) {
        System.out.println("Running in main");
//        ConditionerEntity conditioner1 = new ConditionerEntity("Dove", "Cream", "Dry Hair", "Moisturizes and Nourishes", "18-45", "Daily Use", 250, 1, "Coconut Scent", "Paraben-Free");
//
//        ConditionerEntity conditioner2 = new ConditionerEntity("Pantene", "Liquid", "All Hair Types", "Strengthens and Smoothens", "5-60", "Weekly Use", 200, 3, "Rose Scent", "Sulfate-Free");
//
//        ConditionerEntity conditioner3 = new ConditionerEntity("Herbal Essences", "Gel", "Curly Hair", "Defines and Hydrates Curls", "12-50", "As Needed", 180, 2, "Jasmine Scent", "Silicone-Free");
//
//        ConditionerEntity conditioner4 = new ConditionerEntity("Head & Shoulders", "Cream", "Oily Scalp", "Controls Dandruff", "15-60", "Twice a Week", 150, 1, "Citrus Scent", "Phthalate-Free");
//
//        ConditionerEntity conditioner5 = new ConditionerEntity("Garnier", "Spray", "Color-Treated Hair", "Protects Color Vibrancy", "18-65", "After Each Wash", 200, 4, "Green Apple Scent", "Mineral Oil-Free");
//

        ConditionerRepository conditionerRepository=new ConditionerRepositoryImpl();
//        conditionerRepository.save(conditioner1);

//        List<ConditionerEntity> lists= Arrays.asList(conditioner2,conditioner3,conditioner4,conditioner5);
//        conditionerRepository.saveAll(lists);



//        conditionerRepository.updateNetQuantityByBrand(10,"Dove");

//        conditionerRepository.updateRecommendedUsesByBrand("Herbal Essences","Daily use");

//        List<ConditionerEntity> lists= conditionerRepository.findAllByBrand("Dove");
//        lists.forEach(r-> System.out.println(r));

//        List<ConditionerEntity> lists= conditionerRepository.findAllByHairType("Curly Hair");
//        lists.forEach(p-> System.out.println(p));

        List<ConditionerEntity> lists= conditionerRepository.findScentById(5);
        System.out.println(lists);

    }
}
