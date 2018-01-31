package ladysnake.gaspunk.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Gas_Mask - Alien
 * Created using Tabula 7.0.0
 */
public class Gasmask extends ModelBase {
    public ModelRenderer shape15;
    public ModelRenderer shape16;
    public ModelRenderer shape17;
    public ModelRenderer Sides;
    public ModelRenderer shape24;
    public ModelRenderer shape85;
    public ModelRenderer shape85_1;
    public ModelRenderer shape17_1;
    public ModelRenderer shape17_2;
    public ModelRenderer shape20;
    public ModelRenderer shape22;
    public ModelRenderer shape33;
    public ModelRenderer shape23;
    public ModelRenderer shape23_1;
    public ModelRenderer shape23_2;
    public ModelRenderer shape23_3;
    public ModelRenderer BackPiece1;
    public ModelRenderer BackPiece2;
    public ModelRenderer shape25;
    public ModelRenderer shape26;
    public ModelRenderer shape25_1;
    public ModelRenderer shape26_1;
    public ModelRenderer MainNosePart;
    public ModelRenderer shape30;
    public ModelRenderer shape31;
    public ModelRenderer shape32;
    public ModelRenderer TupeLeft;
    public ModelRenderer TupeRight;
    public ModelRenderer shape36;
    public ModelRenderer shape36_1;
    public ModelRenderer shape38;
    public ModelRenderer shape38_1;
    public ModelRenderer shape69;
    public ModelRenderer shape69_1;
    public ModelRenderer shape69_2;
    public ModelRenderer shape69_3;
    public ModelRenderer shape69_4;
    public ModelRenderer shape69_5;
    public ModelRenderer shape69_6;
    public ModelRenderer shape69_7;
    public ModelRenderer shape69_8;
    public ModelRenderer shape69_9;
    public ModelRenderer Top_Strap_Left;
    public ModelRenderer Top_Strap_Right;
    public ModelRenderer shape32_1;
    public ModelRenderer shape32_2;
    public ModelRenderer shape50;
    public ModelRenderer Lower_Strap_Left;
    public ModelRenderer Lower_Strap_Right;
    public ModelRenderer shape50_1;
    public ModelRenderer shape85_2;
    public ModelRenderer shape85_3;
    public ModelRenderer shape59;
    public ModelRenderer shape59_1;
    public ModelRenderer shape59_2;
    public ModelRenderer shape59_3;
    public ModelRenderer shape36_2;
    public ModelRenderer shape36_3;
    public ModelRenderer shape38_2;
    public ModelRenderer shape38_3;
    public ModelRenderer shape36_4;
    public ModelRenderer shape36_5;
    public ModelRenderer shape38_4;
    public ModelRenderer shape38_5;
    public ModelRenderer shape81;
    public ModelRenderer shape81_1;
    public ModelRenderer shape81_2;
    public ModelRenderer shape81_3;
    public ModelRenderer shape34;
    public ModelRenderer shape34_1;
    public ModelRenderer shape34_2;
    public ModelRenderer shape34_3;
    public ModelRenderer shape34_4;
    public ModelRenderer shape34_5;

    public Gasmask() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape81_3 = new ModelRenderer(this, 28, 31);
        this.shape81_3.setRotationPoint(0.3F, 0.0F, 0.3F);
        this.shape81_3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape69_2 = new ModelRenderer(this, 58, 6);
        this.shape69_2.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.shape69_2.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69_2, 0.5654866776461628F, -0.06283185307179587F, 0.0F);
        this.shape81_2 = new ModelRenderer(this, 38, 28);
        this.shape81_2.setRotationPoint(0.3F, 0.0F, -0.3F);
        this.shape81_2.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape23_2 = new ModelRenderer(this, 51, 14);
        this.shape23_2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shape23_2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(shape23_2, -0.2638937829015426F, 0.0F, 0.0F);
        this.shape59_3 = new ModelRenderer(this, 37, 30);
        this.shape59_3.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.shape59_3.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(shape59_3, 0.0F, 0.0F, 0.1884955592153876F);
        this.shape16 = new ModelRenderer(this, 20, 0);
        this.shape16.setRotationPoint(0.0F, -7.2F, -0.5F);
        this.shape16.addBox(-4.0F, 0.0F, 1.0F, 8, 1, 4, 0.0F);
        this.setRotateAngle(shape16, 0.06283185307179587F, 0.0F, 0.0F);
        this.shape25 = new ModelRenderer(this, 0, 19);
        this.shape25.setRotationPoint(0.0F, 0.0F, 0.2F);
        this.shape25.addBox(-1.0F, -2.0F, 0.0F, 2, 3, 1, 0.0F);
        this.shape50 = new ModelRenderer(this, 0, 29);
        this.shape50.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape50.addBox(-8.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.shape69_5 = new ModelRenderer(this, 58, 10);
        this.shape69_5.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.shape69_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69_5, -0.3769911184307752F, 0.0F, 0.0F);
        this.shape69_8 = new ModelRenderer(this, 42, 18);
        this.shape69_8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape69_8.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69_8, 0.0F, 0.5026548245743669F, 0.0F);
        this.shape85_3 = new ModelRenderer(this, 0, 23);
        this.shape85_3.setRotationPoint(0.9F, -5.4F, 0.9F);
        this.shape85_3.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape85_3, -0.3141592653589793F, -0.1884955592153876F, 1.1938052083641213F);
        this.TupeRight = new ModelRenderer(this, 58, 0);
        this.TupeRight.setRotationPoint(-1.4F, -0.15530968236001197F, -0.21356474197899633F);
        this.TupeRight.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(TupeRight, 1.529429255975455F, -0.24899625952145504F, -0.8547466210321576F);
        this.shape23_3 = new ModelRenderer(this, 52, 17);
        this.shape23_3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.shape23_3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(shape23_3, -0.7539822368615504F, 0.0F, 0.0F);
        this.shape69_7 = new ModelRenderer(this, 58, 17);
        this.shape69_7.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.shape69_7.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69_7, 0.5654866776461628F, 0.06283185307179587F, 0.0F);
        this.shape34_3 = new ModelRenderer(this, 0, 34);
        this.shape34_3.setRotationPoint(0.44184976937055875F, 2.054543408198886F, 7.374525080649851F);
        this.shape34_3.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape34_3, 0.13700423733994088F, -0.16077438016432286F, -0.16014356409565586F);
        this.shape36_4 = new ModelRenderer(this, 10, 31);
        this.shape36_4.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.shape36_4.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape34_5 = new ModelRenderer(this, 28, 39);
        this.shape34_5.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.shape34_5.addBox(0.0F, -2.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(shape34_5, 0.0F, 0.0F, -0.3769911184307752F);
        this.shape36_2 = new ModelRenderer(this, 54, 30);
        this.shape36_2.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.shape36_2.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape34_1 = new ModelRenderer(this, 59, 33);
        this.shape34_1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.shape34_1.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape34_1, 0.0F, 0.0F, 0.3769911184307752F);
        this.BackPiece1 = new ModelRenderer(this, 34, 18);
        this.BackPiece1.setRotationPoint(0.0F, 1.069870550574234F, 0.8754343855127376F);
        this.BackPiece1.addBox(-1.5F, 0.0F, -0.5F, 3, 4, 2, 0.0F);
        this.setRotateAngle(BackPiece1, 1.0492919462989907F, 0.0F, 0.0F);
        this.shape22 = new ModelRenderer(this, 40, 2);
        this.shape22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape22.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape22, 1.0869910581420685F, 0.0F, 0.0F);
        this.shape85_1 = new ModelRenderer(this, 40, 0);
        this.shape85_1.setRotationPoint(-2.1F, 0.0F, 2.0F);
        this.shape85_1.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape85_1, -0.25132741228718347F, 0.25132741228718347F, -0.3141592653589793F);
        this.shape36_3 = new ModelRenderer(this, 58, 30);
        this.shape36_3.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.shape36_3.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 1, 0.0F);
        this.shape17 = new ModelRenderer(this, 44, 0);
        this.shape17.setRotationPoint(0.0F, -2.8F, -0.3F);
        this.shape17.addBox(-2.5F, 0.3F, 0.1F, 5, 2, 4, 0.0F);
        this.setRotateAngle(shape17, -1.0053096491487339F, 0.0F, 0.0F);
        this.shape34_4 = new ModelRenderer(this, 4, 34);
        this.shape34_4.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.shape34_4.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape34_4, 0.0F, 0.0F, -0.3769911184307752F);
        this.shape30 = new ModelRenderer(this, 47, 20);
        this.shape30.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.shape30.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.shape69 = new ModelRenderer(this, 20, 2);
        this.shape69.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.shape69.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69, -0.3769911184307752F, 0.0F, 0.0F);
        this.shape69_9 = new ModelRenderer(this, 14, 25);
        this.shape69_9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape69_9.addBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape69_9, 0.5026548245743669F, 0.0F, 0.0F);
        this.shape36_5 = new ModelRenderer(this, 14, 31);
        this.shape36_5.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.shape36_5.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 1, 0.0F);
        this.Lower_Strap_Right = new ModelRenderer(this, 0, 31);
        this.Lower_Strap_Right.setRotationPoint(-8.3F, -2.4F, 0.6F);
        this.Lower_Strap_Right.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(Lower_Strap_Right, -0.1884955592153876F, 0.08168140899333462F, 0.0F);
        this.shape17_1 = new ModelRenderer(this, 0, 10);
        this.shape17_1.setRotationPoint(0.0F, -1.4F, -2.5F);
        this.shape17_1.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(shape17_1, 0.5026548245743669F, 0.0F, 0.0F);
        this.shape32_1 = new ModelRenderer(this, 24, 27);
        this.shape32_1.setRotationPoint(-6.0F, -4.4F, -0.40000000000000036F);
        this.shape32_1.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape32_1, -1.5707963267948966F, 0.18849555921538752F, 0.18849555921538752F);
        this.shape38_3 = new ModelRenderer(this, 4, 31);
        this.shape38_3.setRotationPoint(-0.2F, 0.0F, -0.5F);
        this.shape38_3.addBox(-1.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape26 = new ModelRenderer(this, 6, 19);
        this.shape26.setRotationPoint(-0.8F, 0.0F, 1.0F);
        this.shape26.addBox(-1.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
        this.Top_Strap_Right = new ModelRenderer(this, 14, 27);
        this.Top_Strap_Right.setRotationPoint(-7.3F, -5.4F, 0.3F);
        this.Top_Strap_Right.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(Top_Strap_Right, 0.06283185307179587F, 0.06283185307179587F, 0.0F);
        this.TupeLeft = new ModelRenderer(this, 44, 0);
        this.TupeLeft.setRotationPoint(1.4F, -0.15530968236001197F, -0.21356474197899633F);
        this.TupeLeft.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(TupeLeft, 1.529429255975455F, 0.24899625952145504F, 0.8547466210321576F);
        this.shape23_1 = new ModelRenderer(this, 44, 14);
        this.shape23_1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shape23_1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(shape23_1, -0.06911503837897544F, 0.0F, 0.0F);
        this.shape81_1 = new ModelRenderer(this, 30, 27);
        this.shape81_1.setRotationPoint(0.6F, 0.0F, 0.0F);
        this.shape81_1.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape33 = new ModelRenderer(this, 9, 10);
        this.shape33.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape33.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape33, -0.439822971502571F, 0.0F, 0.0F);
        this.shape59 = new ModelRenderer(this, 12, 24);
        this.shape59.setRotationPoint(-0.33377153822569916F, -0.03212628055199929F, 7.452352948053948F);
        this.shape59.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape59, -0.06779714538603633F, 0.18401404851145794F, -0.07527117452296377F);
        this.shape32_2 = new ModelRenderer(this, 47, 27);
        this.shape32_2.setRotationPoint(-1.0F, -4.4F, -0.40000000000000036F);
        this.shape32_2.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape32_2, -1.5707963267948966F, -0.18849555921538752F, -0.18849555921538752F);
        this.shape24 = new ModelRenderer(this, 42, 6);
        this.shape24.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.shape24.addBox(-3.5F, 0.0F, 0.0F, 7, 7, 1, 0.0F);
        this.shape34_2 = new ModelRenderer(this, 18, 39);
        this.shape34_2.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.shape34_2.addBox(-4.0F, -2.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(shape34_2, 0.0F, 0.0F, 0.3769911184307752F);
        this.shape31 = new ModelRenderer(this, 0, 25);
        this.shape31.setRotationPoint(-0.5F, 0.0F, -1.0F);
        this.shape31.addBox(-2.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F);
        this.shape38_1 = new ModelRenderer(this, 56, 20);
        this.shape38_1.setRotationPoint(-0.8F, 0.0F, 0.5F);
        this.shape38_1.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.shape36 = new ModelRenderer(this, 57, 13);
        this.shape36.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.shape36.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.shape85_2 = new ModelRenderer(this, 47, 21);
        this.shape85_2.setRotationPoint(-7.9F, -5.4F, 0.9F);
        this.shape85_2.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape85_2, -0.3141592653589793F, 0.1884955592153876F, -1.1938052083641213F);
        this.MainNosePart = new ModelRenderer(this, 20, 21);
        this.MainNosePart.setRotationPoint(0.0F, 0.8F, 2.0F);
        this.MainNosePart.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(MainNosePart, -0.06283185307179587F, 0.0F, 0.0F);
        this.shape38_2 = new ModelRenderer(this, 0, 31);
        this.shape38_2.setRotationPoint(0.2F, 0.0F, -0.5F);
        this.shape38_2.addBox(0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape34 = new ModelRenderer(this, 55, 33);
        this.shape34.setRotationPoint(-0.44184976937055787F, 2.054543408198886F, 7.374525080649851F);
        this.shape34.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape34, 0.13700423733994088F, 0.16077438016432286F, 0.16014356409565586F);
        this.Lower_Strap_Left = new ModelRenderer(this, 24, 29);
        this.Lower_Strap_Left.setRotationPoint(1.3F, -2.4F, 0.6F);
        this.Lower_Strap_Left.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(Lower_Strap_Left, -0.1884955592153876F, -0.08168140899333462F, 0.0F);
        this.shape85 = new ModelRenderer(this, 18, 0);
        this.shape85.setRotationPoint(2.1F, 0.0F, 2.0F);
        this.shape85.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape85, -0.25132741228718347F, -0.25132741228718347F, 0.3141592653589793F);
        this.shape50_1 = new ModelRenderer(this, 40, 37);
        this.shape50_1.setRotationPoint(0.0F, -6.999999999999999F, 2.0F);
        this.shape50_1.addBox(-8.0F, 0.0F, 0.0F, 9, 2, 2, 0.0F);
        this.Top_Strap_Left = new ModelRenderer(this, 37, 25);
        this.Top_Strap_Left.setRotationPoint(1.3F, -5.4F, 0.3F);
        this.Top_Strap_Left.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(Top_Strap_Left, 0.06283185307179587F, -0.06283185307179587F, 0.0F);
        this.shape32 = new ModelRenderer(this, 33, 24);
        this.shape32.setRotationPoint(0.0F, 1.3F, -1.5F);
        this.shape32.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.shape20 = new ModelRenderer(this, 22, 14);
        this.shape20.setRotationPoint(0.0F, 5.6F, -0.5F);
        this.shape20.addBox(-1.5F, -3.0F, 0.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(shape20, -0.6283185307179586F, 0.0F, 0.0F);
        this.shape23 = new ModelRenderer(this, 34, 14);
        this.shape23.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape23.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(shape23, -0.34557519189487723F, 0.0F, 0.0F);
        this.shape69_3 = new ModelRenderer(this, 58, 8);
        this.shape69_3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape69_3.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69_3, 0.0F, -0.5026548245743669F, 0.0F);
        this.shape59_2 = new ModelRenderer(this, 34, 28);
        this.shape59_2.setRotationPoint(-0.6642551902025731F, -0.036068929894760515F, 7.389686331271795F);
        this.shape59_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape59_2, -0.06779714538603633F, -0.18401404851145794F, 0.07527117452296377F);
        this.shape69_1 = new ModelRenderer(this, 58, 2);
        this.shape69_1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape69_1.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69_1, 0.0F, -0.5654866776461628F, 0.0F);
        this.shape38_5 = new ModelRenderer(this, 24, 31);
        this.shape38_5.setRotationPoint(-0.2F, 0.0F, -0.5F);
        this.shape38_5.addBox(-1.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape38 = new ModelRenderer(this, 41, 14);
        this.shape38.setRotationPoint(0.8F, 0.0F, 0.5F);
        this.shape38.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.shape15 = new ModelRenderer(this, 0, 0);
        this.shape15.setRotationPoint(0.0F, -1.2F, -4.5F);
        this.shape15.addBox(-4.0F, -7.0F, 0.0F, 8, 8, 2, 0.0F);
        this.BackPiece2 = new ModelRenderer(this, 44, 18);
        this.BackPiece2.setRotationPoint(0.0F, 4.0F, 1.5F);
        this.BackPiece2.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(BackPiece2, -0.25132741228718347F, 0.0F, 0.0F);
        this.Sides = new ModelRenderer(this, 20, 5);
        this.Sides.setRotationPoint(3.5F, 0.0F, 0.5F);
        this.Sides.addBox(-8.0F, -7.0F, 0.0F, 9, 7, 2, 0.0F);
        this.shape59_1 = new ModelRenderer(this, 55, 27);
        this.shape59_1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.shape59_1.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(shape59_1, 0.0F, 0.0F, -0.1884955592153876F);
        this.shape69_6 = new ModelRenderer(this, 59, 15);
        this.shape69_6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape69_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape69_6, 0.0F, 0.5654866776461628F, 0.0F);
        this.shape25_1 = new ModelRenderer(this, 12, 19);
        this.shape25_1.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.shape25_1.addBox(-1.0F, -3.0F, -1.0F, 2, 4, 1, 0.0F);
        this.shape17_2 = new ModelRenderer(this, 12, 11);
        this.shape17_2.setRotationPoint(0.0F, -0.6F, -0.75F);
        this.shape17_2.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(shape17_2, 0.23876104167282428F, 0.0F, 0.0F);
        this.shape81 = new ModelRenderer(this, 56, 23);
        this.shape81.setRotationPoint(-0.2F, 1.0F, -0.5F);
        this.shape81.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape81, 0.0F, -0.1884955592153876F, 0.0F);
        this.shape36_1 = new ModelRenderer(this, 31, 14);
        this.shape36_1.setRotationPoint(0.0F, 0.0F, 3.3F);
        this.shape36_1.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.shape26_1 = new ModelRenderer(this, 18, 19);
        this.shape26_1.setRotationPoint(0.8F, 0.0F, 1.0F);
        this.shape26_1.addBox(0.0F, -3.0F, 0.0F, 1, 4, 2, 0.0F);
        this.shape69_4 = new ModelRenderer(this, 42, 21);
        this.shape69_4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape69_4.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape69_4, 0.5026548245743669F, 0.0F, 0.0F);
        this.shape38_4 = new ModelRenderer(this, 18, 31);
        this.shape38_4.setRotationPoint(0.2F, 0.0F, -0.5F);
        this.shape38_4.addBox(0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape81.addChild(this.shape81_3);
        this.shape69_1.addChild(this.shape69_2);
        this.shape81.addChild(this.shape81_2);
        this.shape23_1.addChild(this.shape23_2);
        this.shape59_2.addChild(this.shape59_3);
        this.shape15.addChild(this.shape16);
        this.shape20.addChild(this.shape25);
        this.Sides.addChild(this.shape50);
        this.TupeRight.addChild(this.shape69_5);
        this.shape69_7.addChild(this.shape69_8);
        this.Sides.addChild(this.shape85_3);
        this.MainNosePart.addChild(this.TupeRight);
        this.shape23_2.addChild(this.shape23_3);
        this.shape69_6.addChild(this.shape69_7);
        this.Lower_Strap_Right.addChild(this.shape34_3);
        this.shape32_2.addChild(this.shape36_4);
        this.shape34_4.addChild(this.shape34_5);
        this.shape32_1.addChild(this.shape36_2);
        this.shape34.addChild(this.shape34_1);
        this.shape23_3.addChild(this.BackPiece1);
        this.shape17_2.addChild(this.shape22);
        this.shape16.addChild(this.shape85_1);
        this.shape32_1.addChild(this.shape36_3);
        this.shape15.addChild(this.shape17);
        this.shape34_3.addChild(this.shape34_4);
        this.MainNosePart.addChild(this.shape30);
        this.TupeLeft.addChild(this.shape69);
        this.shape69_8.addChild(this.shape69_9);
        this.shape32_2.addChild(this.shape36_5);
        this.Sides.addChild(this.Lower_Strap_Right);
        this.shape17.addChild(this.shape17_1);
        this.Sides.addChild(this.shape32_1);
        this.shape32_1.addChild(this.shape38_3);
        this.shape20.addChild(this.shape26);
        this.Sides.addChild(this.Top_Strap_Right);
        this.MainNosePart.addChild(this.TupeLeft);
        this.shape23.addChild(this.shape23_1);
        this.shape81.addChild(this.shape81_1);
        this.shape22.addChild(this.shape33);
        this.Top_Strap_Left.addChild(this.shape59);
        this.Sides.addChild(this.shape32_2);
        this.shape15.addChild(this.shape24);
        this.shape34_1.addChild(this.shape34_2);
        this.MainNosePart.addChild(this.shape31);
        this.shape32.addChild(this.shape38_1);
        this.shape32.addChild(this.shape36);
        this.Sides.addChild(this.shape85_2);
        this.shape20.addChild(this.MainNosePart);
        this.shape32_1.addChild(this.shape38_2);
        this.Lower_Strap_Left.addChild(this.shape34);
        this.Sides.addChild(this.Lower_Strap_Left);
        this.shape16.addChild(this.shape85);
        this.Sides.addChild(this.shape50_1);
        this.Sides.addChild(this.Top_Strap_Left);
        this.MainNosePart.addChild(this.shape32);
        this.shape17_1.addChild(this.shape20);
        this.shape33.addChild(this.shape23);
        this.shape69_2.addChild(this.shape69_3);
        this.Top_Strap_Right.addChild(this.shape59_2);
        this.shape69.addChild(this.shape69_1);
        this.shape32_2.addChild(this.shape38_5);
        this.shape32.addChild(this.shape38);
        this.BackPiece1.addChild(this.BackPiece2);
        this.shape15.addChild(this.Sides);
        this.shape59.addChild(this.shape59_1);
        this.shape69_5.addChild(this.shape69_6);
        this.shape20.addChild(this.shape25_1);
        this.shape17_1.addChild(this.shape17_2);
        this.shape32_2.addChild(this.shape81);
        this.shape32.addChild(this.shape36_1);
        this.shape20.addChild(this.shape26_1);
        this.shape69_3.addChild(this.shape69_4);
        this.shape32_2.addChild(this.shape38_4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape15.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
