package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class BlueSkiesCompat {

    public static final DeferredRegister<Item> BLUE_SKIES_ITEMS = DeferredRegister.create("blue_skies", Registry.ITEM_KEY);

    //Aquite
    public static final RegistrySupplier<Item> AQUITE_LONGSWORD = BLUE_SKIES_ITEMS.register("aquite/aquite_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_TWINBLADE = BLUE_SKIES_ITEMS.register("aquite/aquite_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_RAPIER = BLUE_SKIES_ITEMS.register("aquite/aquite_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_KATANA = BLUE_SKIES_ITEMS.register("aquite/aquite_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_SAI = BLUE_SKIES_ITEMS.register("aquite/aquite_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_SPEAR = BLUE_SKIES_ITEMS.register("aquite/aquite_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_GLAIVE = BLUE_SKIES_ITEMS.register("aquite/aquite_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_WARGLAIVE = BLUE_SKIES_ITEMS.register("aquite/aquite_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_CUTLASS = BLUE_SKIES_ITEMS.register("aquite/aquite_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_CLAYMORE = BLUE_SKIES_ITEMS.register("aquite/aquite_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_GREATHAMMER = BLUE_SKIES_ITEMS.register("aquite/aquite_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_GREATAXE = BLUE_SKIES_ITEMS.register("aquite/aquite_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_CHAKRAM = BLUE_SKIES_ITEMS.register("aquite/aquite_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:aquite"));
    public static final RegistrySupplier<Item> AQUITE_SCYTHE = BLUE_SKIES_ITEMS.register("aquite/aquite_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:aquite"));

    //bluebright_wood
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_LONGSWORD = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_TWINBLADE = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_RAPIER = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_KATANA = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_SAI = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_SPEAR = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_GLAIVE = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_WARGLAIVE = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_CUTLASS = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_CLAYMORE = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_GREATHAMMER = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_GREATAXE = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_CHAKRAM = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:bluebright_planks"));
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_SCYTHE = BLUE_SKIES_ITEMS.register("bluebright_wood/bluebright_wood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:bluebright_planks"));

    //charoite
    public static final RegistrySupplier<Item> CHAROITE_LONGSWORD = BLUE_SKIES_ITEMS.register("charoite/charoite_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_TWINBLADE = BLUE_SKIES_ITEMS.register("charoite/charoite_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_RAPIER = BLUE_SKIES_ITEMS.register("charoite/charoite_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_KATANA = BLUE_SKIES_ITEMS.register("charoite/charoite_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_SAI = BLUE_SKIES_ITEMS.register("charoite/charoite_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_SPEAR = BLUE_SKIES_ITEMS.register("charoite/charoite_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_GLAIVE = BLUE_SKIES_ITEMS.register("charoite/charoite_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_WARGLAIVE = BLUE_SKIES_ITEMS.register("charoite/charoite_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_CUTLASS = BLUE_SKIES_ITEMS.register("charoite/charoite_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_CLAYMORE = BLUE_SKIES_ITEMS.register("charoite/charoite_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_GREATHAMMER = BLUE_SKIES_ITEMS.register("charoite/charoite_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_GREATAXE = BLUE_SKIES_ITEMS.register("charoite/charoite_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_CHAKRAM = BLUE_SKIES_ITEMS.register("charoite/charoite_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:charoite"));
    public static final RegistrySupplier<Item> CHAROITE_SCYTHE = BLUE_SKIES_ITEMS.register("charoite/charoite_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHAROITE, CHAROITE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:charoite"));

    //cherry_wood
    public static final RegistrySupplier<Item> CHERRY_WOOD_LONGSWORD = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_TWINBLADE = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_RAPIER = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_KATANA = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_SAI = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_SPEAR = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_GLAIVE = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_WARGLAIVE = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_CUTLASS = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_CLAYMORE = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_GREATHAMMER = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_GREATAXE = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_CHAKRAM = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:cherry_planks"));
    public static final RegistrySupplier<Item> CHERRY_WOOD_SCYTHE = BLUE_SKIES_ITEMS.register("cherry_wood/cherry_wood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.CHERRY_WOOD, CHERRY_WOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:cherry_planks"));

    //diopside
    public static final RegistrySupplier<Item> DIOPSIDE_LONGSWORD = BLUE_SKIES_ITEMS.register("diopside/diopside_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_TWINBLADE = BLUE_SKIES_ITEMS.register("diopside/diopside_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_RAPIER = BLUE_SKIES_ITEMS.register("diopside/diopside_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_KATANA = BLUE_SKIES_ITEMS.register("diopside/diopside_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_SAI = BLUE_SKIES_ITEMS.register("diopside/diopside_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_SPEAR = BLUE_SKIES_ITEMS.register("diopside/diopside_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_GLAIVE = BLUE_SKIES_ITEMS.register("diopside/diopside_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_WARGLAIVE = BLUE_SKIES_ITEMS.register("diopside/diopside_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_CUTLASS = BLUE_SKIES_ITEMS.register("diopside/diopside_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_CLAYMORE = BLUE_SKIES_ITEMS.register("diopside/diopside_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_GREATHAMMER = BLUE_SKIES_ITEMS.register("diopside/diopside_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_GREATAXE = BLUE_SKIES_ITEMS.register("diopside/diopside_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_CHAKRAM = BLUE_SKIES_ITEMS.register("diopside/diopside_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:diopside_gem"));
    public static final RegistrySupplier<Item> DIOPSIDE_SCYTHE = BLUE_SKIES_ITEMS.register("diopside/diopside_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DIOPSIDE, DIOPSIDE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:diopside_gem"));

    //dusk_wood
    public static final RegistrySupplier<Item> DUSK_WOOD_LONGSWORD = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_TWINBLADE = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_RAPIER = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_KATANA = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_SAI = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_SPEAR = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_GLAIVE = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_WARGLAIVE = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_CUTLASS = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_CLAYMORE = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_GREATHAMMER = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_GREATAXE = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_CHAKRAM = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:dusk_planks"));
    public static final RegistrySupplier<Item> DUSK_WOOD_SCYTHE = BLUE_SKIES_ITEMS.register("dusk_wood/dusk_wood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DUSK_WOOD, DUSK_WOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:dusk_planks"));

    //frostbright_wood frostbright_sword
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_LONGSWORD = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_TWINBLADE = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_RAPIER = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_KATANA = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_SAI = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_SPEAR = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_GLAIVE = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_WARGLAIVE = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_CUTLASS = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_CLAYMORE = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_GREATHAMMER = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_GREATAXE = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_CHAKRAM = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:frostbright_plank"));
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_SCYTHE = BLUE_SKIES_ITEMS.register("frostbright_wood/frostbright_wood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:frostbright_plank"));

    //horizonite
    public static final RegistrySupplier<Item> HORIZONITE_LONGSWORD = BLUE_SKIES_ITEMS.register("horizonite/horizonite_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_TWINBLADE = BLUE_SKIES_ITEMS.register("horizonite/horizonite_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_RAPIER = BLUE_SKIES_ITEMS.register("horizonite/horizonite_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_KATANA = BLUE_SKIES_ITEMS.register("horizonite/horizonite_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_SAI = BLUE_SKIES_ITEMS.register("horizonite/horizonite_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_SPEAR = BLUE_SKIES_ITEMS.register("horizonite/horizonite_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_GLAIVE = BLUE_SKIES_ITEMS.register("horizonite/horizonite_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_WARGLAIVE = BLUE_SKIES_ITEMS.register("horizonite/horizonite_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_CUTLASS = BLUE_SKIES_ITEMS.register("horizonite/horizonite_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_CLAYMORE = BLUE_SKIES_ITEMS.register("horizonite/horizonite_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_GREATHAMMER = BLUE_SKIES_ITEMS.register("horizonite/horizonite_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_GREATAXE = BLUE_SKIES_ITEMS.register("horizonite/horizonite_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_CHAKRAM = BLUE_SKIES_ITEMS.register("horizonite/horizonite_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:horizonite_ingot"));
    public static final RegistrySupplier<Item> HORIZONITE_SCYTHE = BLUE_SKIES_ITEMS.register("horizonite/horizonite_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.HORIZONITE, HORIZONITE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:horizonite_ingot"));

    //lunar_stone
    public static final RegistrySupplier<Item> LUNAR_STONE_LONGSWORD = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_TWINBLADE = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_RAPIER = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_KATANA = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_SAI = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_SPEAR = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_GLAIVE = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_WARGLAIVE = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_CUTLASS = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_CLAYMORE = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_GREATHAMMER = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_GREATAXE = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_CHAKRAM = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:lunar_cobblestone"));
    public static final RegistrySupplier<Item> LUNAR_STONE_SCYTHE = BLUE_SKIES_ITEMS.register("lunar_stone/lunar_stone_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_STONE, LUNAR_STONE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:lunar_cobblestone"));

    //lunar_wood
    public static final RegistrySupplier<Item> LUNAR_WOOD_LONGSWORD = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_TWINBLADE = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_RAPIER = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_KATANA = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_SAI = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_SPEAR = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_GLAIVE = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_WARGLAIVE = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_CUTLASS = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_CLAYMORE = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_GREATHAMMER = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_GREATAXE = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_CHAKRAM = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:lunar_planks"));
    public static final RegistrySupplier<Item> LUNAR_WOOD_SCYTHE = BLUE_SKIES_ITEMS.register("lunar_wood/lunar_wood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.LUNAR_WOOD, LUNAR_WOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:lunar_planks"));

    //maple_wood
    public static final RegistrySupplier<Item> MAPLE_WOOD_LONGSWORD = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_TWINBLADE = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_RAPIER = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_KATANA = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_SAI = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_SPEAR = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_GLAIVE = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_WARGLAIVE = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_CUTLASS = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_CLAYMORE = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_GREATHAMMER = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_GREATAXE = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_CHAKRAM = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:maple_planks"));
    public static final RegistrySupplier<Item> MAPLE_WOOD_SCYTHE = BLUE_SKIES_ITEMS.register("maple_wood/maple_wood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.MAPLE_WOOD, MAPLE_WOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:maple_planks"));

    //pyrope
    public static final RegistrySupplier<Item> PYROPE_LONGSWORD = BLUE_SKIES_ITEMS.register("pyrope/pyrope_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_TWINBLADE = BLUE_SKIES_ITEMS.register("pyrope/pyrope_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_RAPIER = BLUE_SKIES_ITEMS.register("pyrope/pyrope_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_KATANA = BLUE_SKIES_ITEMS.register("pyrope/pyrope_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_SAI = BLUE_SKIES_ITEMS.register("pyrope/pyrope_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_SPEAR = BLUE_SKIES_ITEMS.register("pyrope/pyrope_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_GLAIVE = BLUE_SKIES_ITEMS.register("pyrope/pyrope_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_WARGLAIVE = BLUE_SKIES_ITEMS.register("pyrope/pyrope_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_CUTLASS = BLUE_SKIES_ITEMS.register("pyrope/pyrope_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_CLAYMORE = BLUE_SKIES_ITEMS.register("pyrope/pyrope_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_GREATHAMMER = BLUE_SKIES_ITEMS.register("pyrope/pyrope_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_GREATAXE = BLUE_SKIES_ITEMS.register("pyrope/pyrope_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_CHAKRAM = BLUE_SKIES_ITEMS.register("pyrope/pyrope_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:pyrope_gem"));
    public static final RegistrySupplier<Item> PYROPE_SCYTHE = BLUE_SKIES_ITEMS.register("pyrope/pyrope_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.PYROPE, PYROPE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:pyrope_gem"));

    //starlit_wood
    public static final RegistrySupplier<Item> STARLIT_WOOD_LONGSWORD = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_TWINBLADE = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_RAPIER = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_KATANA = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_SAI = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_SPEAR = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_GLAIVE = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_WARGLAIVE = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_CUTLASS = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_CLAYMORE = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_GREATHAMMER = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_GREATAXE = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_CHAKRAM = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:starlit_planks"));
    public static final RegistrySupplier<Item> STARLIT_WOOD_SCYTHE = BLUE_SKIES_ITEMS.register("starlit_wood/starlit_wood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STARLIT_WOOD, STARLIT_WOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:starlit_planks"));

    //turquoise_stone
    public static final RegistrySupplier<Item> TURQUOISE_STONE_LONGSWORD = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_TWINBLADE = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_RAPIER = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_KATANA = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_SAI = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_SPEAR = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_GLAIVE = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_WARGLAIVE = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_CUTLASS = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_CLAYMORE = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_GREATHAMMER = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_GREATAXE = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_CHAKRAM = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
    public static final RegistrySupplier<Item> TURQUOISE_STONE_SCYTHE = BLUE_SKIES_ITEMS.register("turquoise_stone/turquoise_stone_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TURQUOISE_STONE, TURQUOISE_STONE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "blue_skies:turquoise_cobblestone"));
}
