package jorid148.test_spring.converter;

import jorid148.test_spring.entity.Skill;
import jorid148.test_spring.dto.SkillDto;

public class SkillConverter {
    public static Skill dtoToEntity(SkillDto SkillDto) {
        Skill Skill = new Skill(SkillDto.getSkillName(), null);
        Skill.setSkillId(SkillDto.getSkillId());
        return Skill;
    }
    public static SkillDto entityToDto(Skill skill) {
        return new SkillDto(skill.getSkillId(), skill.getSkillName());
    }
}
}