package com.tetris.tetrominoes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.tetris.TetrisGrid;

import java.awt.*;

public abstract class Piece {
    class PieceType {
        public static final int S = 0;
        public static final int Z = 1;
        public static final int T = 2;
        public static final int L = 3;
        public static final int I = 4;
        public static final int J = 5;
        public static final int O = 6;
    }

    protected int type;
    protected Color color;

    public abstract void rotateLeft(TetrisGrid grid);
    public abstract void rotateRight(TetrisGrid grid);
    public abstract void moveRight(TetrisGrid grid);
    public abstract void moveLeft(TetrisGrid grid);
    public abstract void moveDown(TetrisGrid grid);
    public abstract void render(ShapeRenderer shapeRenderer);
}