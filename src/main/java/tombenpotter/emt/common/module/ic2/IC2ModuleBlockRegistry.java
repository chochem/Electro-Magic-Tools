/*******************************************************************************
 * Copyright (c) 2014 Tombenpotter.
 * All rights reserved. 
 *
 * This program and the accompanying materials are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at http://www.gnu.org/licenses/gpl.html
 *
 * This class was made by Tombenpotter and is distributed as a part of the Electro-Magic Tools mod.
 * Electro-Magic Tools is a derivative work on Thaumcraft 4 (c) Azanor 2012.
 * http://www.minecraftforum.net/topic/1585216-
 ******************************************************************************/

package tombenpotter.emt.common.module.ic2;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import tombenpotter.emt.ModInformation;
import tombenpotter.emt.common.module.ic2.blocks.*;
import tombenpotter.emt.common.module.ic2.items.blocks.*;

public class IC2ModuleBlockRegistry {

	public static Block essentiaGens;
	public static Block shield;
	public static Block emtSolars;
	public static Block emtMachines;
	public static Block emtSolars2;
	public static Block portableNode;
	public static Block essentiaGenerator;

	public static void registerBlocks() {
		shield = new BlockShield().setBlockName(ModInformation.modid + ".shield");
		portableNode = new BlockPortableNode().setBlockName(ModInformation.modid + ".portablenode");
		emtSolars = new BlockEMTSolars().setBlockName(ModInformation.modid + ".emtsolars");
		emtSolars2 = new BlockEMTSolars2().setBlockName(ModInformation.modid + ".emtsolars2");
		emtMachines = new BlockEMTMachines().setBlockName(ModInformation.modid + ".emtmachines");
		essentiaGens = new BlockEssentiaGenerators().setBlockName(ModInformation.modid + ".essentiaGens");
		essentiaGenerator = new BlockEssentiaGenerator().setBlockName(ModInformation.modid + ".essentiaGenerator");

		GameRegistry.registerBlock(shield, "Shield Block");
		GameRegistry.registerBlock(portableNode, "Portable Node");
		GameRegistry.registerBlock(emtSolars, ItemBlockEMTSolars.class, "EMT Solar Panels");
		GameRegistry.registerBlock(emtSolars2, ItemBlockEMTSolars2.class, "EMT Solars 2");
		GameRegistry.registerBlock(emtMachines, ItemBlockEMTMachines.class, "EMT Machines");
		GameRegistry.registerBlock(essentiaGens, ItemBlockEssentiaGenerators.class, "Essentia Generators");
		GameRegistry.registerBlock(essentiaGenerator, ItemBlockEssentiaGenerator.class, "Essentia Generator");
	}
}