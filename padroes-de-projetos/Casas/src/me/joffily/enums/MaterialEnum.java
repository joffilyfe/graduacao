package me.joffily.enums;

import me.joffily.interfaces.Material;
import me.joffily.materiais.LoucaDECA;
import me.joffily.materiais.LoucaElizabeth;
import me.joffily.materiais.MetalFerro;

public enum MaterialEnum {
	ELIZABETH(new LoucaElizabeth()), DECA(new LoucaDECA()), FERRO(new MetalFerro());
	private Material material;

	private MaterialEnum(Material m) {
		this.material = m;
	}

	public Material get() {
		return this.material;
	}
}
