package com.tetris;


import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TetrisPieceQueue {
    private final ArrayDeque<Integer> queue;

    public TetrisPieceQueue() {
        this.queue = new ArrayDeque<>(14);

        this.reload();
        this.reload();
    }

    private void reload() {
        ArrayList<Integer> pieces = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            pieces.add(i);
        }

        int min = 0;
        int max = 6;
        for (int i = 0; i < 7; i++, max--) {
            int index = (int) (Math.random() * max - min) + min;
            int piece = pieces.remove(index);
            this.queue.add(piece);
        }
    }

    public int deque() {
        if (this.queue.size() == 7) {
            this.reload();
        }

        return this.queue.pop();
    }

    public void render(ShapeRenderer shapeRenderer) {
    }
}