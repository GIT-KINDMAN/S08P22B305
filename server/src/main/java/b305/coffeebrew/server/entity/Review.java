package b305.coffeebrew.server.entity;

import b305.coffeebrew.server.config.utils.BaseAtTime;
import b305.coffeebrew.server.config.utils.BooleanToYNConverter;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "review")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review extends BaseAtTime implements Serializable {

    // 식별번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    // 회원 식별
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_idx")
    private Member memberIdx;

    @NotBlank
    private String item_type;

    @NotBlank
    private Long item_idx;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotBlank
    private int overall; // 총점

    @NotBlank
    private int aroma; // 향

    @NotBlank
    private int flavor; // 맛

    @NotBlank
    private int acidity; // 산미

    @NotBlank
    private int body; // 바디감

    @NotBlank
    private int balance; // 밸런스

    @NotBlank
    private int after; // 후미

    @NotBlank
    private String aroma_note; // 향 상세

    @NotBlank
    private String flavor_note; // 맛 상세

    @NotBlank
    private int like; // 좋아요 수자

    @Convert(converter = BooleanToYNConverter.class)
    @NotBlank
    private boolean expired;

    @Override
    public void prePersist() {
        super.prePersist();
    }
}
