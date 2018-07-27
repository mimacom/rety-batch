package com.mimacom.rety.batch;

import java.util.Objects;

public class Product {
    
    public String asins;
    public String parentASIN;
    public String sku;
    public String brand;
    public String author;
    public String artist;
    public String title;
    public String imagepathmedium;
    public String imagepathsmall;
    public String imagepathlarge;
    public String topcategory;
    public String ean;
    public String mpn;
    public String eanlist;
    public String mpnlist;
    public String productdescription;
    public String platforms;
    public String releasedate;
    public String eec;
    public String salerank;
    public String browsenode1;
    public String browsenode2;
    public String subcategorypath1;
    public String subcategorypath2;
    public String gender;
    public String color;
    public String size;
    public String stp;
    public String info1;
    public String info2;
    public String price1;
    public String availablity1;
    public String shipping1;
    public String salerestriction1;
    public String url1;
    public String merchantId1;
    public String PPU1;
    public String price2;
    public String availablity2;
    public String shipping2;
    public String salerestriction2;
    public String url2;
    public String merchantId2;
    public String PPU2;
    public String price3;
    public String availablity3;
    public String shipping3;
    public String salerestriction3;
    public String url3;
    public String merchantId3;
    public String PPU3;
    public String price4;
    public String availablity4;
    public String shipping4;
    public String salerestriction4;
    public String url4;
    public String merchantId4;
    public String PPU4;
    public String price5;
    public String availablity5;
    public String shipping5;
    public String salerestriction5;
    public String url5;
    public String merchantId5;
    public String PPU5;
    public String price6;
    public String availablity6;
    public String shipping6;
    public String salerestriction6;
    public String url6;
    public String merchantId6;
    public String PPU6;
    public String deltaflag;

    public Product() {
    }

    public Product(String asins, String parentASIN, String sku, String brand, String author, String artist, String title, String imagepathmedium, String imagepathsmall, String imagepathlarge, String topcategory, String ean, String mpn, String eanlist, String mpnlist, String productdescription, String platforms, String releasedate, String eec, String salerank, String browsenode1, String browsenode2, String subcategorypath1, String subcategorypath2, String gender, String color, String size, String stp, String info1, String info2, String price1, String availablity1, String shipping1, String salerestriction1, String url1, String merchantId1, String PPU1, String price2, String availablity2, String shipping2, String salerestriction2, String url2, String merchantId2, String PPU2, String price3, String availablity3, String shipping3, String salerestriction3, String url3, String merchantId3, String PPU3, String price4, String availablity4, String shipping4, String salerestriction4, String url4, String merchantId4, String PPU4, String price5, String availablity5, String shipping5, String salerestriction5, String url5, String merchantId5, String PPU5, String price6, String availablity6, String shipping6, String salerestriction6, String url6, String merchantId6, String PPU6, String deltaflag) {
        this.asins = asins;
        this.parentASIN = parentASIN;
        this.sku = sku;
        this.brand = brand;
        this.author = author;
        this.artist = artist;
        this.title = title;
        this.imagepathmedium = imagepathmedium;
        this.imagepathsmall = imagepathsmall;
        this.imagepathlarge = imagepathlarge;
        this.topcategory = topcategory;
        this.ean = ean;
        this.mpn = mpn;
        this.eanlist = eanlist;
        this.mpnlist = mpnlist;
        this.productdescription = productdescription;
        this.platforms = platforms;
        this.releasedate = releasedate;
        this.eec = eec;
        this.salerank = salerank;
        this.browsenode1 = browsenode1;
        this.browsenode2 = browsenode2;
        this.subcategorypath1 = subcategorypath1;
        this.subcategorypath2 = subcategorypath2;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.stp = stp;
        this.info1 = info1;
        this.info2 = info2;
        this.price1 = price1;
        this.availablity1 = availablity1;
        this.shipping1 = shipping1;
        this.salerestriction1 = salerestriction1;
        this.url1 = url1;
        this.merchantId1 = merchantId1;
        this.PPU1 = PPU1;
        this.price2 = price2;
        this.availablity2 = availablity2;
        this.shipping2 = shipping2;
        this.salerestriction2 = salerestriction2;
        this.url2 = url2;
        this.merchantId2 = merchantId2;
        this.PPU2 = PPU2;
        this.price3 = price3;
        this.availablity3 = availablity3;
        this.shipping3 = shipping3;
        this.salerestriction3 = salerestriction3;
        this.url3 = url3;
        this.merchantId3 = merchantId3;
        this.PPU3 = PPU3;
        this.price4 = price4;
        this.availablity4 = availablity4;
        this.shipping4 = shipping4;
        this.salerestriction4 = salerestriction4;
        this.url4 = url4;
        this.merchantId4 = merchantId4;
        this.PPU4 = PPU4;
        this.price5 = price5;
        this.availablity5 = availablity5;
        this.shipping5 = shipping5;
        this.salerestriction5 = salerestriction5;
        this.url5 = url5;
        this.merchantId5 = merchantId5;
        this.PPU5 = PPU5;
        this.price6 = price6;
        this.availablity6 = availablity6;
        this.shipping6 = shipping6;
        this.salerestriction6 = salerestriction6;
        this.url6 = url6;
        this.merchantId6 = merchantId6;
        this.PPU6 = PPU6;
        this.deltaflag = deltaflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(asins, product.asins) &&
                Objects.equals(parentASIN, product.parentASIN) &&
                Objects.equals(sku, product.sku) &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(author, product.author) &&
                Objects.equals(artist, product.artist) &&
                Objects.equals(title, product.title) &&
                Objects.equals(imagepathmedium, product.imagepathmedium) &&
                Objects.equals(imagepathsmall, product.imagepathsmall) &&
                Objects.equals(imagepathlarge, product.imagepathlarge) &&
                Objects.equals(topcategory, product.topcategory) &&
                Objects.equals(ean, product.ean) &&
                Objects.equals(mpn, product.mpn) &&
                Objects.equals(eanlist, product.eanlist) &&
                Objects.equals(mpnlist, product.mpnlist) &&
                Objects.equals(productdescription, product.productdescription) &&
                Objects.equals(platforms, product.platforms) &&
                Objects.equals(releasedate, product.releasedate) &&
                Objects.equals(eec, product.eec) &&
                Objects.equals(salerank, product.salerank) &&
                Objects.equals(browsenode1, product.browsenode1) &&
                Objects.equals(browsenode2, product.browsenode2) &&
                Objects.equals(subcategorypath1, product.subcategorypath1) &&
                Objects.equals(subcategorypath2, product.subcategorypath2) &&
                Objects.equals(gender, product.gender) &&
                Objects.equals(color, product.color) &&
                Objects.equals(size, product.size) &&
                Objects.equals(stp, product.stp) &&
                Objects.equals(info1, product.info1) &&
                Objects.equals(info2, product.info2) &&
                Objects.equals(price1, product.price1) &&
                Objects.equals(availablity1, product.availablity1) &&
                Objects.equals(shipping1, product.shipping1) &&
                Objects.equals(salerestriction1, product.salerestriction1) &&
                Objects.equals(url1, product.url1) &&
                Objects.equals(merchantId1, product.merchantId1) &&
                Objects.equals(PPU1, product.PPU1) &&
                Objects.equals(price2, product.price2) &&
                Objects.equals(availablity2, product.availablity2) &&
                Objects.equals(shipping2, product.shipping2) &&
                Objects.equals(salerestriction2, product.salerestriction2) &&
                Objects.equals(url2, product.url2) &&
                Objects.equals(merchantId2, product.merchantId2) &&
                Objects.equals(PPU2, product.PPU2) &&
                Objects.equals(price3, product.price3) &&
                Objects.equals(availablity3, product.availablity3) &&
                Objects.equals(shipping3, product.shipping3) &&
                Objects.equals(salerestriction3, product.salerestriction3) &&
                Objects.equals(url3, product.url3) &&
                Objects.equals(merchantId3, product.merchantId3) &&
                Objects.equals(PPU3, product.PPU3) &&
                Objects.equals(price4, product.price4) &&
                Objects.equals(availablity4, product.availablity4) &&
                Objects.equals(shipping4, product.shipping4) &&
                Objects.equals(salerestriction4, product.salerestriction4) &&
                Objects.equals(url4, product.url4) &&
                Objects.equals(merchantId4, product.merchantId4) &&
                Objects.equals(PPU4, product.PPU4) &&
                Objects.equals(price5, product.price5) &&
                Objects.equals(availablity5, product.availablity5) &&
                Objects.equals(shipping5, product.shipping5) &&
                Objects.equals(salerestriction5, product.salerestriction5) &&
                Objects.equals(url5, product.url5) &&
                Objects.equals(merchantId5, product.merchantId5) &&
                Objects.equals(PPU5, product.PPU5) &&
                Objects.equals(price6, product.price6) &&
                Objects.equals(availablity6, product.availablity6) &&
                Objects.equals(shipping6, product.shipping6) &&
                Objects.equals(salerestriction6, product.salerestriction6) &&
                Objects.equals(url6, product.url6) &&
                Objects.equals(merchantId6, product.merchantId6) &&
                Objects.equals(PPU6, product.PPU6) &&
                Objects.equals(deltaflag, product.deltaflag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asins, parentASIN, sku, brand, author, artist, title, imagepathmedium, imagepathsmall, imagepathlarge, topcategory, ean, mpn, eanlist, mpnlist, productdescription, platforms, releasedate, eec, salerank, browsenode1, browsenode2, subcategorypath1, subcategorypath2, gender, color, size, stp, info1, info2, price1, availablity1, shipping1, salerestriction1, url1, merchantId1, PPU1, price2, availablity2, shipping2, salerestriction2, url2, merchantId2, PPU2, price3, availablity3, shipping3, salerestriction3, url3, merchantId3, PPU3, price4, availablity4, shipping4, salerestriction4, url4, merchantId4, PPU4, price5, availablity5, shipping5, salerestriction5, url5, merchantId5, PPU5, price6, availablity6, shipping6, salerestriction6, url6, merchantId6, PPU6, deltaflag);
    }

    @Override
    public String toString() {
        return "Product{" +
                "asins='" + asins + '\'' +
                ", parentASIN='" + parentASIN + '\'' +
                ", sku='" + sku + '\'' +
                ", brand='" + brand + '\'' +
                ", author='" + author + '\'' +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", imagepathmedium='" + imagepathmedium + '\'' +
                ", imagepathsmall='" + imagepathsmall + '\'' +
                ", imagepathlarge='" + imagepathlarge + '\'' +
                ", topcategory='" + topcategory + '\'' +
                ", ean='" + ean + '\'' +
                ", mpn='" + mpn + '\'' +
                ", eanlist='" + eanlist + '\'' +
                ", mpnlist='" + mpnlist + '\'' +
                ", productdescription='" + productdescription + '\'' +
                ", platforms='" + platforms + '\'' +
                ", releasedate='" + releasedate + '\'' +
                ", eec='" + eec + '\'' +
                ", salerank='" + salerank + '\'' +
                ", browsenode1='" + browsenode1 + '\'' +
                ", browsenode2='" + browsenode2 + '\'' +
                ", subcategorypath1='" + subcategorypath1 + '\'' +
                ", subcategorypath2='" + subcategorypath2 + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", stp='" + stp + '\'' +
                ", info1='" + info1 + '\'' +
                ", info2='" + info2 + '\'' +
                ", price1='" + price1 + '\'' +
                ", availablity1='" + availablity1 + '\'' +
                ", shipping1='" + shipping1 + '\'' +
                ", salerestriction1='" + salerestriction1 + '\'' +
                ", url1='" + url1 + '\'' +
                ", merchantId1='" + merchantId1 + '\'' +
                ", PPU1='" + PPU1 + '\'' +
                ", price2='" + price2 + '\'' +
                ", availablity2='" + availablity2 + '\'' +
                ", shipping2='" + shipping2 + '\'' +
                ", salerestriction2='" + salerestriction2 + '\'' +
                ", url2='" + url2 + '\'' +
                ", merchantId2='" + merchantId2 + '\'' +
                ", PPU2='" + PPU2 + '\'' +
                ", price3='" + price3 + '\'' +
                ", availablity3='" + availablity3 + '\'' +
                ", shipping3='" + shipping3 + '\'' +
                ", salerestriction3='" + salerestriction3 + '\'' +
                ", url3='" + url3 + '\'' +
                ", merchantId3='" + merchantId3 + '\'' +
                ", PPU3='" + PPU3 + '\'' +
                ", price4='" + price4 + '\'' +
                ", availablity4='" + availablity4 + '\'' +
                ", shipping4='" + shipping4 + '\'' +
                ", salerestriction4='" + salerestriction4 + '\'' +
                ", url4='" + url4 + '\'' +
                ", merchantId4='" + merchantId4 + '\'' +
                ", PPU4='" + PPU4 + '\'' +
                ", price5='" + price5 + '\'' +
                ", availablity5='" + availablity5 + '\'' +
                ", shipping5='" + shipping5 + '\'' +
                ", salerestriction5='" + salerestriction5 + '\'' +
                ", url5='" + url5 + '\'' +
                ", merchantId5='" + merchantId5 + '\'' +
                ", PPU5='" + PPU5 + '\'' +
                ", price6='" + price6 + '\'' +
                ", availablity6='" + availablity6 + '\'' +
                ", shipping6='" + shipping6 + '\'' +
                ", salerestriction6='" + salerestriction6 + '\'' +
                ", url6='" + url6 + '\'' +
                ", merchantId6='" + merchantId6 + '\'' +
                ", PPU6='" + PPU6 + '\'' +
                ", deltaflag='" + deltaflag + '\'' +
                '}';
    }

    public String getAsins() {
        return asins;
    }

    public void setAsins(String asins) {
        this.asins = asins;
    }

    public String getParentASIN() {
        return parentASIN;
    }

    public void setParentASIN(String parentASIN) {
        this.parentASIN = parentASIN;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagepathmedium() {
        return imagepathmedium;
    }

    public void setImagepathmedium(String imagepathmedium) {
        this.imagepathmedium = imagepathmedium;
    }

    public String getImagepathsmall() {
        return imagepathsmall;
    }

    public void setImagepathsmall(String imagepathsmall) {
        this.imagepathsmall = imagepathsmall;
    }

    public String getImagepathlarge() {
        return imagepathlarge;
    }

    public void setImagepathlarge(String imagepathlarge) {
        this.imagepathlarge = imagepathlarge;
    }

    public String getTopcategory() {
        return topcategory;
    }

    public void setTopcategory(String topcategory) {
        this.topcategory = topcategory;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getEanlist() {
        return eanlist;
    }

    public void setEanlist(String eanlist) {
        this.eanlist = eanlist;
    }

    public String getMpnlist() {
        return mpnlist;
    }

    public void setMpnlist(String mpnlist) {
        this.mpnlist = mpnlist;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getEec() {
        return eec;
    }

    public void setEec(String eec) {
        this.eec = eec;
    }

    public String getSalerank() {
        return salerank;
    }

    public void setSalerank(String salerank) {
        this.salerank = salerank;
    }

    public String getBrowsenode1() {
        return browsenode1;
    }

    public void setBrowsenode1(String browsenode1) {
        this.browsenode1 = browsenode1;
    }

    public String getBrowsenode2() {
        return browsenode2;
    }

    public void setBrowsenode2(String browsenode2) {
        this.browsenode2 = browsenode2;
    }

    public String getSubcategorypath1() {
        return subcategorypath1;
    }

    public void setSubcategorypath1(String subcategorypath1) {
        this.subcategorypath1 = subcategorypath1;
    }

    public String getSubcategorypath2() {
        return subcategorypath2;
    }

    public void setSubcategorypath2(String subcategorypath2) {
        this.subcategorypath2 = subcategorypath2;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStp() {
        return stp;
    }

    public void setStp(String stp) {
        this.stp = stp;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getAvailablity1() {
        return availablity1;
    }

    public void setAvailablity1(String availablity1) {
        this.availablity1 = availablity1;
    }

    public String getShipping1() {
        return shipping1;
    }

    public void setShipping1(String shipping1) {
        this.shipping1 = shipping1;
    }

    public String getSalerestriction1() {
        return salerestriction1;
    }

    public void setSalerestriction1(String salerestriction1) {
        this.salerestriction1 = salerestriction1;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getMerchantId1() {
        return merchantId1;
    }

    public void setMerchantId1(String merchantId1) {
        this.merchantId1 = merchantId1;
    }

    public String getPPU1() {
        return PPU1;
    }

    public void setPPU1(String PPU1) {
        this.PPU1 = PPU1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public String getAvailablity2() {
        return availablity2;
    }

    public void setAvailablity2(String availablity2) {
        this.availablity2 = availablity2;
    }

    public String getShipping2() {
        return shipping2;
    }

    public void setShipping2(String shipping2) {
        this.shipping2 = shipping2;
    }

    public String getSalerestriction2() {
        return salerestriction2;
    }

    public void setSalerestriction2(String salerestriction2) {
        this.salerestriction2 = salerestriction2;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getMerchantId2() {
        return merchantId2;
    }

    public void setMerchantId2(String merchantId2) {
        this.merchantId2 = merchantId2;
    }

    public String getPPU2() {
        return PPU2;
    }

    public void setPPU2(String PPU2) {
        this.PPU2 = PPU2;
    }

    public String getPrice3() {
        return price3;
    }

    public void setPrice3(String price3) {
        this.price3 = price3;
    }

    public String getAvailablity3() {
        return availablity3;
    }

    public void setAvailablity3(String availablity3) {
        this.availablity3 = availablity3;
    }

    public String getShipping3() {
        return shipping3;
    }

    public void setShipping3(String shipping3) {
        this.shipping3 = shipping3;
    }

    public String getSalerestriction3() {
        return salerestriction3;
    }

    public void setSalerestriction3(String salerestriction3) {
        this.salerestriction3 = salerestriction3;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getMerchantId3() {
        return merchantId3;
    }

    public void setMerchantId3(String merchantId3) {
        this.merchantId3 = merchantId3;
    }

    public String getPPU3() {
        return PPU3;
    }

    public void setPPU3(String PPU3) {
        this.PPU3 = PPU3;
    }

    public String getPrice4() {
        return price4;
    }

    public void setPrice4(String price4) {
        this.price4 = price4;
    }

    public String getAvailablity4() {
        return availablity4;
    }

    public void setAvailablity4(String availablity4) {
        this.availablity4 = availablity4;
    }

    public String getShipping4() {
        return shipping4;
    }

    public void setShipping4(String shipping4) {
        this.shipping4 = shipping4;
    }

    public String getSalerestriction4() {
        return salerestriction4;
    }

    public void setSalerestriction4(String salerestriction4) {
        this.salerestriction4 = salerestriction4;
    }

    public String getUrl4() {
        return url4;
    }

    public void setUrl4(String url4) {
        this.url4 = url4;
    }

    public String getMerchantId4() {
        return merchantId4;
    }

    public void setMerchantId4(String merchantId4) {
        this.merchantId4 = merchantId4;
    }

    public String getPPU4() {
        return PPU4;
    }

    public void setPPU4(String PPU4) {
        this.PPU4 = PPU4;
    }

    public String getPrice5() {
        return price5;
    }

    public void setPrice5(String price5) {
        this.price5 = price5;
    }

    public String getAvailablity5() {
        return availablity5;
    }

    public void setAvailablity5(String availablity5) {
        this.availablity5 = availablity5;
    }

    public String getShipping5() {
        return shipping5;
    }

    public void setShipping5(String shipping5) {
        this.shipping5 = shipping5;
    }

    public String getSalerestriction5() {
        return salerestriction5;
    }

    public void setSalerestriction5(String salerestriction5) {
        this.salerestriction5 = salerestriction5;
    }

    public String getUrl5() {
        return url5;
    }

    public void setUrl5(String url5) {
        this.url5 = url5;
    }

    public String getMerchantId5() {
        return merchantId5;
    }

    public void setMerchantId5(String merchantId5) {
        this.merchantId5 = merchantId5;
    }

    public String getPPU5() {
        return PPU5;
    }

    public void setPPU5(String PPU5) {
        this.PPU5 = PPU5;
    }

    public String getPrice6() {
        return price6;
    }

    public void setPrice6(String price6) {
        this.price6 = price6;
    }

    public String getAvailablity6() {
        return availablity6;
    }

    public void setAvailablity6(String availablity6) {
        this.availablity6 = availablity6;
    }

    public String getShipping6() {
        return shipping6;
    }

    public void setShipping6(String shipping6) {
        this.shipping6 = shipping6;
    }

    public String getSalerestriction6() {
        return salerestriction6;
    }

    public void setSalerestriction6(String salerestriction6) {
        this.salerestriction6 = salerestriction6;
    }

    public String getUrl6() {
        return url6;
    }

    public void setUrl6(String url6) {
        this.url6 = url6;
    }

    public String getMerchantId6() {
        return merchantId6;
    }

    public void setMerchantId6(String merchantId6) {
        this.merchantId6 = merchantId6;
    }

    public String getPPU6() {
        return PPU6;
    }

    public void setPPU6(String PPU6) {
        this.PPU6 = PPU6;
    }

    public String getDeltaflag() {
        return deltaflag;
    }

    public void setDeltaflag(String deltaflag) {
        this.deltaflag = deltaflag;
    }
}
