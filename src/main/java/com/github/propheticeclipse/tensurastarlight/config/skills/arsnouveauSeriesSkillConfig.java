package com.github.propheticeclipse.tensurastarlight.config.skills;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class arsnouveauSeriesSkillConfig extends ManasConfig {
    public templateSkill templateSkill = new templateSkill();

    public String getFileName() {
        return "tensura/tensura-starlight/skills/arsnoveau-series";
    }

    public static class templateSkill extends ManasSubConfig {

    }
}
