package com.xworkz.fertilizerJpa.boot;

import com.xworkz.fertilizerJpa.entity.TempleEntity;
import com.xworkz.fertilizerJpa.repo.TempleRepository;
import com.xworkz.fertilizerJpa.repo.TempleRepositoryImpl;

import java.util.List;

public class TempleRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main");

//        TempleEntity entity=new TempleEntity("Isckon temple","Mahalakshmi layout",100,1000, LocalDate.of(2010,8,21),"Radha krishna",1500.60);
//        TempleEntity entity1=new TempleEntity("Anjaneya temple","HSR layout",300,1500, LocalDate.of(2020,4,11),"Hanumaan",2000);
//        TempleEntity entity2=new TempleEntity("Ram mandir","Rajajinagar",150,1800, LocalDate.of(2018,8,28),"Ram",1200.50);
//        TempleEntity entity3=new TempleEntity("Shiv temple","Majestic",50,1500, LocalDate.of(2024,1,11),"Shiva",200.60);
        TempleRepository repo = new TempleRepositoryImpl();
//        //repo.save(entity);
//        List<TempleEntity> lists= Arrays.asList(entity,entity1,entity2,entity3);
//        repo.saveAll(lists);

//        System.out.println("FindAllByLocation");
//         List<TempleEntity> lists=repo.findAllByLocation("Isckon temple");
//      lists.forEach(e-> System.out.println(e));


//        System.out.println("FindAllByEntryFeeGreaterThan");
//       List<TempleEntity> entityList=repo.findAllByEntryFeeGreaterThan(200);
//       entityList.forEach(s-> System.out.println(s));


//     System.out.println("FindAllByEntryFeeBetween");
//  List<TempleEntity> templeEntities=repo.findAllByEntryFeeBetween(100,200);
//      templeEntities.forEach(r-> System.out.println(r));

//        System.out.println("findAllByInaguratedDateGreaterThan");
//        List<TempleEntity> templeEntities=repo.findAllByInaguratedDateGreaterThan(LocalDate.of(2012,2,21));
//        templeEntities.forEach(p-> System.out.println(p));



//        System.out.println("mainGod and location");
//        List<TempleEntity> templeEntities=repo.findAllByMainGodAndLocation("Ram","Rajajinagar");
//       templeEntities.forEach(s-> System.out.println(s));

//        System.out.println("findById");
//        List<TempleEntity> lists = repo.findById(5);
//      lists.forEach(e-> System.out.println(e));

//        System.out.println("Find by Id and MainGod");
//        List<TempleEntity> list1=repo.findByIdAndMainGod(4,"Hanumaan");
//        list1.forEach(o-> System.out.println(o));

        System.out.println("FindTotal");
        System.out.println("Total:"+repo.findTotal());
    }
}