package group11.comp3211.model.piece;

import group11.comp3211.common.exceptions.LogicException;
import group11.comp3211.model.Direction;
import group11.comp3211.model.JungleType;
import group11.comp3211.model.Player;
import group11.comp3211.view.Language;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class Dog extends Piece {
    public Dog(int row, int col, Player player) {
        super(row, col, player);
        this.rank = 3;
        this.type = JungleType.DOG;
    }

    @Override
    public String getSymbol(Language language) {
        return switch (language) {
            case ENGLISH -> null;
            case CHINESE_SIMPLE -> "狗";
            case CHINESE_TRADITIONAL -> null;
            case EMOJI -> null;
        };
    }

    @Override
    public void move(Direction direction) throws LogicException {

    }
}
