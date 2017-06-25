package familiarfauna.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModCompat
{
    public static Biome alps = null;
    public static Biome bamboo_forest = null;
    public static Biome bayou = null;
    public static Biome bog = null;
    public static Biome boreal_forest = null;
    public static Biome brushland = null;
    public static Biome chaparral = null;
    public static Biome cherry_blossom_grove = null;
    public static Biome cold_desert = null;
    public static Biome coniferous_forest = null;
    public static Biome crag = null;
    public static Biome dead_forest = null;
    public static Biome dead_swamp = null;
    public static Biome eucalyptus_forest = null;
    public static Biome fen = null;
    public static Biome flower_field = null;
    public static Biome grassland = null;    
    public static Biome grove = null;
    public static Biome highland = null;
    public static Biome land_of_lakes = null;
    public static Biome lavender_fields = null;
    public static Biome lush_desert = null;
    public static Biome lush_swamp = null;
    public static Biome mangrove = null;
    public static Biome maple_woods = null;
    public static Biome marsh = null;
    public static Biome meadow = null;
    public static Biome moor = null;
    public static Biome mountain = null;
    public static Biome mystic_grove = null;
    public static Biome ominous_woods = null;
    public static Biome orchard = null;
    public static Biome outback = null;
    public static Biome overgrown_cliffs = null;
    public static Biome prairie = null;
    public static Biome quagmire = null;
    public static Biome rainforest = null;
    public static Biome redwood_forest = null;
    public static Biome sacred_springs = null;
    public static Biome seasonal_forest = null;
    public static Biome shield = null;
    public static Biome shrubland = null;
    public static Biome snowy_coniferous_forest = null;
    public static Biome snowy_forest = null;
    public static Biome steppe = null;
    public static Biome temperate_rainforest = null;
    public static Biome tropical_rainforest = null;
    public static Biome tundra = null;
    public static Biome wasteland = null;
    public static Biome wetland = null;
    public static Biome woodland = null;
    public static Biome xeric_shrubland = null;
    
    // edge-biomes, sub-biomes and mutated-biomes
    public static Biome alps_foothills = null;
    public static Biome mountain_foothills = null;
    public static Biome glacier = null;
    public static Biome oasis = null;
    public static Biome coral_reef = null;
    public static Biome kelp_forest = null;
    public static Biome origin_island = null;
    public static Biome tropical_island = null;
    public static Biome volcanic_island = null;
    public static Biome flower_island = null;
    public static Biome gravel_beach = null;
    public static Biome white_beach = null;

    // nether biomes
    public static Biome corrupted_sands = null;
    public static Biome fungi_forest = null;
    public static Biome phantasmagoric_inferno = null;
    public static Biome polar_chasm = null;
    public static Biome undergarden = null;
    public static Biome visceral_heap = null;
    
    public static void init()
    {
        alps = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:alps"));
        bamboo_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:bamboo_forest"));
        bayou = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:bayou"));
        bog = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:bog"));
        boreal_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:boreal_forest"));
        brushland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:brushland"));
        chaparral = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:chaparral"));
        cherry_blossom_grove = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:cherry_blossom_grove"));
        cold_desert = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:cold_desert"));
        coniferous_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:coniferous_forest"));
        crag = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:crag"));
        dead_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:dead_forest"));
        dead_swamp = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:dead_swamp"));
        eucalyptus_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:eucalyptus_forest"));
        fen = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:fen"));
        flower_field = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:flower_field"));
        grassland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:grassland"));
        grove = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:grove"));
        highland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:highland"));
        land_of_lakes = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:land_of_lakes"));
        lavender_fields = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:lavender_fields"));
        lush_desert = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:lush_desert"));
        lush_swamp = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:lush_swamp"));
        mangrove = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:mangrove"));
        maple_woods = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:maple_woods"));
        marsh = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:marsh"));
        meadow = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:meadow"));
        moor = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:moor"));
        mountain = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:mountain"));
        mystic_grove = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:mystic_grove"));
        ominous_woods = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:ominous_woods"));
        orchard = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:orchard"));
        outback = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:outback"));
        overgrown_cliffs = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:overgrown_cliffs"));
        prairie = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:prairie"));
        quagmire = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:quagmire"));
        rainforest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:rainforest"));
        redwood_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:redwood_forest"));
        sacred_springs = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:sacred_springs"));
        seasonal_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:seasonal_forest"));
        shield = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:shield"));
        shrubland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:shrubland"));
        snowy_coniferous_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:snowy_coniferous_forest"));
        snowy_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:snowy_forest"));
        steppe = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:steppe"));
        temperate_rainforest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:temperate_rainforest"));
        tropical_rainforest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:tropical_rainforest"));
        tundra = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:tundra"));
        wasteland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:wasteland"));
        wetland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:wetland"));
        woodland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:woodland"));
        xeric_shrubland = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:xeric_shrubland"));
        
        alps_foothills = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:alps_foothills"));
        mountain_foothills = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:mountain_foothills"));
        glacier = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:glacier"));
        oasis = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:oasis"));
        coral_reef = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:coral_reef"));
        kelp_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:kelp_forest"));
        origin_island = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:origin_island"));
        tropical_island = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:tropical_island"));
        volcanic_island = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:volcanic_island"));
        flower_island = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:flower_island"));
        gravel_beach = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:gravel_beach"));
        white_beach = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:white_beach"));
        
        corrupted_sands = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:corrupted_sands"));
        fungi_forest = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:fungi_forest"));
        phantasmagoric_inferno = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:phantasmagoric_inferno"));
        polar_chasm = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:polar_chasm"));
        undergarden = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:undergarden"));
        visceral_heap = ForgeRegistries.BIOMES.getValue(new ResourceLocation("biomesoplenty:visceral_heap"));
    }
}
