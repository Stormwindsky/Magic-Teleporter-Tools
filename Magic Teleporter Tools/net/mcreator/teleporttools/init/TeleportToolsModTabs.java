/*    */ package net.mcreator.teleporttools.init;
/*    */ 
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.CreativeModeTabs;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.common.Mod.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class TeleportToolsModTabs
/*    */ {
/* 20 */   public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "teleport_tools");
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
/* 24 */     if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
/* 25 */       tabData.accept((ItemLike)TeleportToolsModItems.NETHER_TELEPORTER_TOOL.get());
/* 26 */       tabData.accept((ItemLike)TeleportToolsModItems.END_TELEPORTER.get());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/teleport_tools-1.0.0-neoforge-1.20.4.jar!/net/mcreator/teleporttools/init/TeleportToolsModTabs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */