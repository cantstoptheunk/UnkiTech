package com.example.demo.category.player;

import com.example.demo.category.attribute.Attribute;
import com.example.demo.category.attribute.PlayerAttributes;
import com.example.demo.distributions.CustomNormalDistribution;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.category.attribute.AttributeConstants.*;

public class NFLPlayerFactory extends AbstractPlayerFactory {

    public static Player generatePlayer(Position pos){
        PlayerGeneralInfo playerGeneralInfo = generateGeneralInfo(pos);
        PlayerAttributes playerAttributes = generatePlayerAttributes(pos);
        return new Player(playerGeneralInfo, playerAttributes);
    }

    private static PlayerGeneralInfo generateGeneralInfo(Position pos) {
        PlayerGeneralInfo playerGeneralInfo =  new PlayerGeneralInfo(pos);
        playerGeneralInfo.setAge(generateAge(Status.Pro));
        playerGeneralInfo.setFirstName(generateFirstName());
        playerGeneralInfo.setLastName(generateLastName());
        playerGeneralInfo.setCollege(generateCollege());
        return playerGeneralInfo;
    }

    private static PlayerAttributes generatePlayerAttributes(Position pos){
        switch(pos){
            case QB: return new PlayerAttributes(generateQBAttributes());
        }
        return new PlayerAttributes();
    }

    /* POSITION ATTRIBUTE GENERATORS */
    private static Map<String, Attribute> generateQBAttributes(){
        Map<String, Attribute> attributes = new HashMap<>();
        attributes.put(SPEED, new Attribute(SPEED, SPEED_DESC, CustomNormalDistribution.ND_DEFAULT_AVG_SD.sample()));
        attributes.put(ACCELERATION, new Attribute(ACCELERATION, ACCELERATION_DESC, CustomNormalDistribution.ND_DEFAULT_AVG_SD.sample()));
        return attributes;
    }

}
