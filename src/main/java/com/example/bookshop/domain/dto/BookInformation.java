package com.example.bookshop.domain.dto;



import com.example.bookshop.domain.enums.AgeRestriction;
import com.example.bookshop.domain.enums.EditionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class BookInformation {

    private String title;

    private EditionType editionType;

    private AgeRestriction ageRestriction;

    private BigDecimal price;

    @Override
    public String toString() {
        return this.title + " "
                + this.editionType.name() + " "
                + this.ageRestriction.name() + " "
                + this.price;
    }
}
