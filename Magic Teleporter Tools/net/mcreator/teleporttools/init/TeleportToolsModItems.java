/*    */ package net.mcreator.teleporttools.init;
/*    */ 
/*    */ import net.mcreator.teleporttools.item.EndTeleporterItem;
/*    */ import net.mcreator.teleporttools.item.NetherTeleporterToolItem;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.neoforged.bus.api.IEventBus;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TeleportToolsModItems
/*    */ {
/* 19 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create((Registry)BuiltInRegistries.ITEM, "teleport_tools");
/* 20 */   public static final DeferredHolder<Item, Item> NETHER_TELEPORTER_TOOL = REGISTRY.register("nether_teleporter_tool", () -> new NetherTeleporterToolItem());
/* 21 */   public static final DeferredHolder<Item, Item> END_TELEPORTER = REGISTRY.register("end_teleporter", () -> new EndTeleporterItem());
/*    */ 
/*    */ 
/*    */   
/*    */   public static void register(IEventBus bus) {
/* 26 */     REGISTRY.register(bus);
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/teleport_tools-1.0.0-neoforge-1.20.4.jar!/net/mcreator/teleporttools/init/TeleportToolsModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */