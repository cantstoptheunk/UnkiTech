package com.example.demo.people.player;

import com.example.demo.people.attribute.AttributeConstants;
import com.example.demo.people.attribute.PlayerAttributes;
import com.example.demo.generic.Category;
import com.example.demo.distributions.CustomNormalDistribution;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.generic.CategoryType.TYPE_ATTRIBUTE;

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
    private static Map<String, Category> generateQBAttributes(){
        Map<String, Category> attributes = new HashMap<>();
        attributes.put(AttributeConstants.SPEED, new Category(AttributeConstants.SPEED, TYPE_ATTRIBUTE, AttributeConstants.SPEED_DESC, CustomNormalDistribution.ND_DEFAULT_AVG_SD.sample()));
        attributes.put(AttributeConstants.ACCELERATION, new Category(AttributeConstants.ACCELERATION, TYPE_ATTRIBUTE, AttributeConstants.ACCELERATION_DESC, CustomNormalDistribution.ND_DEFAULT_AVG_SD.sample()));
        attributes.put(AttributeConstants.OVERALL, new Category(AttributeConstants.OVERALL, TYPE_ATTRIBUTE, AttributeConstants.OVERALL_DESC, attributes.get(AttributeConstants.SPEED).getValue()+attributes.get(AttributeConstants.ACCELERATION).getValue()));
        return attributes;
    }

}
