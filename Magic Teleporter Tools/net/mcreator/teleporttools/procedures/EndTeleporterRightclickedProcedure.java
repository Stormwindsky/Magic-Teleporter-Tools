/*    */ package net.mcreator.teleporttools.procedures;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class EndTeleporterRightclickedProcedure {
/*    */   public static void execute(Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (entity instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity; if (!_player.level().isClientSide()) {
/* 20 */         ResourceKey<Level> destinationType = Level.OVERWORLD;
/* 21 */         if (_player.level().dimension() == destinationType)
/*    */           return; 
/* 23 */         ServerLevel nextLevel = _player.server.getLevel(destinationType);
/* 24 */         if (nextLevel != null) {
/* 25 */           _player.connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/* 26 */           _player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
/* 27 */           _player.connection.send((Packet)new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
/* 28 */           for (MobEffectInstance _effectinstance : _player.getActiveEffects())
/* 29 */             _player.connection.send((Packet)new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance)); 
/* 30 */           _player.connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/teleport_tools-1.0.0-neoforge-1.20.4.jar!/net/mcreator/teleporttools/procedures/EndTeleporterRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */