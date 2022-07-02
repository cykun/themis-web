package com.cyquen.themis.service;

import com.cyquen.themis.model.BgpInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MockBgpInfoService implements BgpInfoService {

    private static List<BgpInfo> bgpInfos = new ArrayList<>();

    static {
        bgpInfos.add(new BgpInfo(new Date(), "18.0.2.0/24", "A", 59));
        bgpInfos.add(new BgpInfo(new Date(), "82.0.2.0/24", "A", 33));
        bgpInfos.add(new BgpInfo(new Date(), "55.0.2.0/24", "A", 52));
    }

    @Override
    public List<BgpInfo> getBgpInfoList() {
        return bgpInfos;
    }
}
