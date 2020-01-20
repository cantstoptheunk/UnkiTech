package com.example.demo.people.player;

import com.example.demo.generic.CategoryDbl;
import com.example.demo.people.attribute.AttributeConstants;
import com.example.demo.people.attribute.PlayerAttributes;
import com.example.demo.generic.Category;
import com.example.demo.distributions.CustomNormalDistribution;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.generic.CategoryType.TYPE_ATTRIBUTE;
import static com.example.demo.people.attribute.AttributeConstants.*;

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
        attributes.put(SPEED, new CategoryDbl(SPEED, TYPE_ATTRIBUTE, AttributeConstants.SPEED_DESC, CustomNormalDistribution.ND_DEFAULT_AVG_SD.sample()));
        attributes.put(ACCELERATION, new CategoryDbl(ACCELERATION, TYPE_ATTRIBUTE, AttributeConstants.ACCELERATION_DESC, CustomNormalDistribution.ND_DEFAULT_AVG_SD.sample()));
        attributes.put(OVERALL, new CategoryDbl(OVERALL, TYPE_ATTRIBUTE, AttributeConstants.OVERALL_DESC, (double)attributes.get(SPEED).getValue() + (double)attributes.get(ACCELERATION).getValue()));
        return attributes;
    }

}
