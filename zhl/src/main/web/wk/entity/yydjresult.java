package wk.entity;

import java.util.List;

/**
 * @Author: zhanghl
 * @Date: 2018/11/16 15:54
 */
public class yydjresult {
    private List<yydj> yydj;
    private List<yydj_dygx> yydj_dygx;

    public List<wk.entity.yydj> getYydj() {
        return yydj;
    }

    public void setYydj(List<wk.entity.yydj> yydj) {
        this.yydj = yydj;
    }

    public List<wk.entity.yydj_dygx> getYydj_dygx() {
        return yydj_dygx;
    }

    public void setYydj_dygx(List<wk.entity.yydj_dygx> yydj_dygx) {
        this.yydj_dygx = yydj_dygx;
    }

    public List<wk.entity.yydj_zx> getYydj_zx() {
        return yydj_zx;
    }

    public void setYydj_zx(List<wk.entity.yydj_zx> yydj_zx) {
        this.yydj_zx = yydj_zx;
    }

    public List<wk.entity.yydjdfjz_djzm> getYydjdfjz_djzm() {
        return yydjdfjz_djzm;
    }

    public void setYydjdfjz_djzm(List<wk.entity.yydjdfjz_djzm> yydjdfjz_djzm) {
        this.yydjdfjz_djzm = yydjdfjz_djzm;
    }

    public List<wk.entity.yydjdjfz_dymx> getYydjdjfz_dymx() {
        return yydjdjfz_dymx;
    }

    public void setYydjdjfz_dymx(List<wk.entity.yydjdjfz_dymx> yydjdjfz_dymx) {
        this.yydjdjfz_dymx = yydjdjfz_dymx;
    }

    private List<yydj_zx> yydj_zx;
    private List<yydjdfjz_djzm> yydjdfjz_djzm;
    private List<yydjdjfz_dymx> yydjdjfz_dymx;
}
