package pl.wszib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.domain.Car;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Car> listCar;

    public CarController() {
        listCar = generateList();
    }

    @GetMapping ("car/list")
    public String returnList(Model model){

        List<Car> list = generateList();
        model.addAttribute("list", list);

        return "returnListTemplate";

    }

    @GetMapping("car/single/{index}")
    public  String getOne (Model model, @PathVariable int index){
        List<Car> list = generateList();
        Car car = list.get(index);
        model.addAttribute(car);
        return "getOneTemplate";
    }

    @GetMapping("links")
    public String links(Model model){
        return "linksTemplate";
    }

    @GetMapping("car/form")
    public String forms (Model model){

        model.addAttribute("car", new Car());
        return "formsTemplate";
    }

    @PostMapping("car/form")
    public String formsSave (Car car, Model model){

        listCar.add(car);
        return "saveCarTemplate";
    }

    private List<Car> generateList() {

        List<Car> list = new ArrayList<>();

        Car car1 = new Car();
        car1.setMarka("BMW");
        car1.setModel("M140i");
        car1.setCena(286402);
        car1.setRocznik("2019");
        car1.setPrzebieg(86723567);

        list.add(car1);

        Car car2 = new Car();
        car2.setMarka("BMW");
        car2.setModel("M240i ");
        car2.setCena(836524);
        car2.setRocznik("2018");
        car2.setPrzebieg(8607653);

        list.add(car2);

        Car car3 = new Car();
        car3.setMarka("BMW");
        car3.setModel("M47i");
        car3.setCena(956726);
        car3.setRocznik("2019");
        car3.setPrzebieg(45794);


        list.add(car3);

        Car car4 = new Car();
        car4.setMarka("Mazda");
        car4.setModel("56H");
        car4.setCena(974246);
        car4.setRocznik("2019");
        car4.setPrzebieg(84268);

        list.add(car4);

        Car car5 = new Car();
        car5.setMarka("Mazda");
        car5.setModel("Hi75");
        car5.setCena(4687264);
        car5.setRocznik("2017");
        car5.setPrzebieg(93467);

        list.add(car5);

        Car car6 = new Car();
        car6.setMarka("Mazda");
        car6.setModel("Kl76");
        car6.setCena(579836);
        car6.setRocznik("2016");
        car6.setPrzebieg(6837593);

        list.add(car6);

        Car car7 = new Car();
        car7.setMarka("Peugeot");
        car7.setModel("Gh5");
        car7.setCena(874249);
        car7.setRocznik("2019");
        car7.setPrzebieg(86928);

        list.add(car7);

        Car car8 = new Car();
        car8.setMarka("Peugeot");
        car8.setModel("Kl64");
        car8.setCena(48723);
        car8.setRocznik("2015");
        car8.setPrzebieg(7873456);

        list.add(car8);

        Car car9 = new Car();
        car9.setMarka("Peugeot");
        car9.setModel("Ft83");
        car9.setCena(234643);
        car9.setRocznik("2013");
        car9.setPrzebieg(847883572);

        list.add(car9);

        Car car10 = new Car();
        car10.setMarka("Peugeot");
        car10.setModel("kGY3");
        car10.setCena(873435);
        car10.setRocznik("2017");
        car10.setPrzebieg(357946);

        list.add(car10);

        return list;
    }
}


//    Stwórz kontroler z metodą (np. requestMapping: car/list GET) która będzie zwracać listę/tablicę samochodów (zmyślone dane) zawierającą około 10 elementów.