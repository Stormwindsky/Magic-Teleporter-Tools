/*    */ package net.mcreator.teleporttools.item;
/*    */ 
/*    */ import net.mcreator.teleporttools.procedures.NetherTeleporterToolRightclickedOnBlockProcedure;
/*    */ import net.mcreator.teleporttools.procedures.NetherTeleporterToolRightclickedProcedure;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.neoforged.api.distmarker.Dist;
/*    */ import net.neoforged.api.distmarker.OnlyIn;
/*    */ 
/*    */ public class NetherTeleporterToolItem
/*    */   extends Item
/*    */ {
/*    */   public NetherTeleporterToolItem() {
/* 22 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public boolean isFoil(ItemStack itemstack) {
/* 28 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 33 */     InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
/* 34 */     NetherTeleporterToolRightclickedProcedure.execute((Entity)entity);
/* 35 */     return ar;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 40 */     super.useOn(context);
/* 41 */     NetherTeleporterToolRightclickedOnBlockProcedure.execute((Entity)context.getPlayer());
/* 42 */     return InteractionResult.SUCCESS;
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/teleport_tools-1.0.0-neoforge-1.20.4.jar!/net/mcreator/teleporttools/item/NetherTeleporterToolItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */