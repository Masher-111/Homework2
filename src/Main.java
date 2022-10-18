import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args)
    {
        Random random = ThreadLocalRandom.current();


        // creating an array with rewards
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new PlatinumGenerator());
        generatorList.add(new BronzeGenerator());



         //open 10 boxes with rewards
        for(int i = 0; i < 10; i ++)
        {
            int index = (int)(Math.random() * (5));
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }

    }




}



/**
 * item generator
 */
abstract class ItemGenerator
{
    /**
     * the method that opens the Item
     */
    public  void openReward()
    {
        GameItem gameItem = createItem();
        gameItem.open();

    }

    /**
     * item creation
     * @return GameItem
     */
    public abstract GameItem createItem();

}


/**
 * interface, link to the  method open
 */
interface GameItem {
    void open();
}


/**
 * reward classes, generator sub-products Gold
 */
class GoldReward implements GameItem
{
    /**
     * method for connecting the interface
     */
    @Override
    public void open()
    {
        System.out.println("Gold");
    }

}

/**
 * reward classes, generator sub-products Gem
 */
class GemReward implements GameItem
{
    /**
     * method for connecting the interface
     */
    @Override
    public void open()
    {
        System.out.println("Gem");
    }

}

/**
 * reward classes, generator sub-products  Silver
 */
class SilverReward implements GameItem
{
    /**
     * method for connecting the interface
     */
    @Override
    public void open()
    {
        System.out.println("Silver");
    }

}

/**
 * reward classes, generator sub-products Platinum
 */
class PlatinumReward implements GameItem
{
    /**
     * method for connecting the interface
     */
    @Override
    public void open()
    {
        System.out.println("Platinum");
    }

}

/**
 * reward classes, generator sub-products Bronze
 */
class BronzeReward implements GameItem
{
    /**
     * method for connecting the interface
     */
    @Override
    public void open()
    {
        System.out.println("Bronze");
    }

}



/**
 * factory, class generator Gold reward
 */
class GoldGenerator extends ItemGenerator
{
    /**
     * overriding the abstract method  GameItem
     * @return GoldReward
     */
    @Override
    public GameItem createItem()
    {
        return new GoldReward();
    }

}

/**
 * factory, class generator Gem reward
 */
class GemGenerator extends ItemGenerator
{
    /**
     * overriding the abstract method  GameItem
     * @return GemReward
     */
    @Override
    public GameItem createItem()
    {
        return new GemReward();
    }


}

/**
 * factory, class generator Silver reward
 */
class SilverGenerator extends ItemGenerator
{
    /**
     * overriding the abstract method  GameItem
     * @return SilverReward
     */
    @Override
    public GameItem createItem()
    {
        return new SilverReward();
    }

}

/**
 * factory, class generator Platinum reward
 */
class PlatinumGenerator extends ItemGenerator
{
    /**
     * overriding the abstract method  GameItem
     * @return PlatinumReward
     */
    @Override
    public GameItem createItem()
    {
        return new PlatinumReward();
    }

}

/**
 * factory, class generator Bronze reward
 */
class BronzeGenerator extends ItemGenerator
{
    /**
     * overriding the abstract method  GameItem
     * @return BronzeReward
     */
    @Override
    public GameItem createItem()
    {
        return new BronzeReward();
    }

}