package com.elmakers.mine.bukkit.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.bukkit.Material;

public class CSVParser
{
	public List<Integer> parseIntegers(String csvList)
	{
		List<Integer> ints = new ArrayList<Integer>();

		String[] intStrings = csvList.split(",");
		for (String s : intStrings)
		{
			try
			{
				int thisInt = Integer.parseInt(s.trim());
				ints.add(thisInt);
			}
			catch (NumberFormatException ex)
			{

			}
		}
		return ints;
	}

	public List<String> parseStrings(String csvList)
	{
		List<String> strings = new ArrayList<String>();

		String[] stringArray = csvList.split(",");
		for (String s : stringArray)
		{
			strings.add(s);
		}
		return strings;
	}

	@SuppressWarnings("deprecation")
	public void parseMaterials(Set<Material> materials, String csvList)
	{
		String[] matIds = csvList.split(",");
		for (String matId : matIds)
		{
			try
			{
				int typeId = Integer.parseInt(matId.trim());
				materials.add(Material.getMaterial(typeId));
			}
			catch (NumberFormatException ex)
			{

			}
		}
	}

	public Set<Material> parseMaterials(String csvList)
	{
		Set<Material> materials = new TreeSet<Material>();
		parseMaterials(materials, csvList);
		return materials;

	}
}
