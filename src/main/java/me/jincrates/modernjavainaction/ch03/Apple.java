package me.jincrates.modernjavainaction.ch03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.jincrates.modernjavainaction.ch03.Color;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apple {

    private int weight = 0;

    private Color color;
}
