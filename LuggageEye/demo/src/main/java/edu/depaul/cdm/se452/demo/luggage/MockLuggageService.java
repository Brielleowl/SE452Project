package edu.depaul.cdm.se452.demo.luggage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
@Service
@ConditionalOnProperty(name = "datasource", havingValue = "mock")
public class MockLuggageService implements ILuggageService{
    private static List<Luggage> LUGGAGES = new ArrayList<>();
    static Random random = new Random();
    static{
        Stream.of("Chicago", "NewYork","San Francisco", "Los Angeles","Boston")
            .forEach(location ->{
                Luggage luggage = new Luggage();
                luggage.setLocation(location);
                luggage.setId(random.nextLong());
                luggage.setPassengerID(random.nextInt());
                luggage.setStatus("In transit");
                luggage.setWeight(random.nextInt(100));
                luggage.setConfirmationNumber(random.nextInt());
                
            });
    }
    @Override
    public List<Luggage> findAll() {
        return LUGGAGES;
    }
    @Override
    public Luggage update(Luggage luggage) {
        Luggage originLuggage = findById(luggage.getId());
        LUGGAGES.remove(originLuggage);
        LUGGAGES.add(luggage);

        return luggage;
    }
    @Override
    public Luggage findById(long luggageId) {
        for (Luggage luggage : LUGGAGES) {
            if (luggage.getId() == luggageId) {
                return luggage;
            }
        }
        return null;
    }

    @Override
    public void deleteById(long luggageId) {
        LUGGAGES.remove(findById(luggageId));
    }
}
