package lista4;

/**
 *
 * @author Carlos Antonio
 */
public class TesteBuildingCar {

    
    public static void main(String[] args) {
        CarbonFootprint[] carbonFootprints = new CarbonFootprint[3];

        Car carro = new Car("", "");

        carro.setCombustivel("Alcool");
        carro.setModelo("Sedãn");

        House house = new House(0, 0, true, 0, true);

        house.setTamanho(100);
        house.setNumeroDeLampadas(50);
        house.setNumeroDePessoas(7);
        house.setUsoDeArCondicionado(true);
        house.setUsoDeEnergiaRenovavel(true);

        School school = new School(true, 0, true, 0, true);

        school.setLaboratorios(true);
        school.setNumeroDeLampadas(600);
        school.setNumeroDePessoas(200);
        school.setUsoDeArCondicionado(false);
        school.setUsoDeEnergiaRenovavel(false);


        carbonFootprints[0] = carro;
        carbonFootprints[1] = house;
        carbonFootprints[2] = school;


        for (int i = 0; i < carbonFootprints.length; i++) {
            System.out.println("Emissão de CO² das categoria :" + (i + 1) + " " + carbonFootprints[i].getCarbonFootprint());

        }

    }
    
}
